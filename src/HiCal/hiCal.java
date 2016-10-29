package HiCal;

/*
 Your company built an in-house calendar tool called HiCal. You want to add a feature to see the times in a day when everyone is available.
To do this, you’ll need to know when any team is having a meeting. In HiCal, a meeting is stored as an object of a Meeting class with integer variables startTime and endTime. These integers represent the number of 30-minute blocks past 9:00am.

  public class Meeting {

    int startTime;
    int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }

    public String toString() {
        return String.format("(%d, %d)", startTime, endTime);
    }
}
Java
For example:

  new Meeting(2, 3); // meeting from 10:00 – 10:30 am
new Meeting(6, 9); // meeting from 12:00 – 1:30 pm

Write a function condenseMeetingTimes() that takes a list of meeting time ranges and returns a list of condensed ranges.

For example, given:

  [(0, 1), (3, 5), (4, 8), (10, 12), (9, 10)]

your function would return:

  [(0, 1), (3, 8), (9, 12)]

Do not assume the meetings are in order. The meeting times are coming from multiple teams.

In this case the possibilities for startTime and endTime are bounded by the number of 30-minute slots in a day. But soon you plan to refactor HiCal to store times as Unix timestamps (which are big numbers). Write something that's efficient even when we can't put a nice upper bound on the numbers representing our time ranges.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class hiCal 
{

	public ArrayList<Meeting> hiCalculator(Meeting[] arr)
	{
		ArrayList<Meeting> mergeList=new ArrayList<Meeting>();
		
		Arrays.sort(arr);
		
		mergeList.add(arr[0]);
		
		for(int i=0;i<arr.length;i++)
		{
			Meeting lastMeeting=mergeList.get(mergeList.size()-1);
			
			if(arr[i].startTime<=lastMeeting.endTime)
			{
				lastMeeting.endTime=Math.max(arr[i].endTime, lastMeeting.endTime);
			}
			else
			{
				mergeList.add(arr[i]);
			}
		}
	
		return  mergeList;
	}
	
	public static void main(String[] args)
	{
		Meeting[] meeting={ new Meeting(1, 2),  new Meeting(2, 3)};
		
		//new Meeting(1, 10), new Meeting(2, 6), new Meeting(3, 5), new Meeting(7, 9)}
		//{new Meeting(1, 5), new Meeting(2, 3)};
	    //{ new Meeting(1, 2),  new Meeting(2, 3)};
	    //{new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8), new Meeting(10, 12), new Meeting(9, 10)};
		
		hiCal cal=new hiCal();
		
		ArrayList<Meeting> list=cal.hiCalculator(meeting);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).toString());
		}
	}
	
}

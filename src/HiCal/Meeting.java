package HiCal;

public class Meeting implements Comparable<Meeting> {
   
	int startTime;
	int endTime;
	
	public Meeting()
	{
		
	}
	
	public Meeting(int startTime,int endTime)
	{
		this.startTime=startTime;
		this.endTime=endTime;
	}
	
	public String toString() {
        return String.format("(%d,%d)",startTime,endTime);
    }

	@Override
	public int compareTo(Meeting o) {
		
		if(this.startTime>o.startTime)
		return 0;
		else
			return -1;
	}
	
	
}

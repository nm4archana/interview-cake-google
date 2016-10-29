package tempTracker;

/*
You decide to test if your oddly-mathematical heating company is fulfilling its All-Time Max, Min, Mean and Mode Temperature Guarantee™.
Write a class TempTracker with these methods:

insert()—records a new temperature
getMax()—returns the highest temp we've seen so far
getMin()—returns the lowest temp we've seen so far
getMean()—returns the mean ↴ of all temps we've seen so far
getMode()—returns the mode ↴ of all temps we've seen so far
Optimize for space and time. Favor speeding up the getter functions (getMax(), getMin(), getMean(), and getMode()) over speeding up the insert() function.

getMean() should return a float, but the rest of the getter functions can return integers. Temperatures will all be inserted as integers. We'll record our temperatures in Fahrenheit, so we can assume they'll all be in the range 0..1100..110.

If there is more than one mode, return any of the modes.
 */

public class tempTracker {

	Integer maxTemp;
	Integer minTemp;
	float mean;
	Integer mode;
	Boolean flag=false;
	int maxOccurance=0;
	
	int tmpSum=0;
	int totalTemp=0;
	//upto 110;
	int[] noOfOccurance=new int[111];
	
	public Boolean addTemp(int temp)
	{	
		//For insertion
		noOfOccurance[temp]=noOfOccurance[temp]+1;
		
		//To find mode
		if(noOfOccurance[temp]>maxOccurance)
		{
			maxOccurance=noOfOccurance[temp];
			mode=temp;
		}
		
		//To find mean
		totalTemp=totalTemp+1;
		tmpSum=tmpSum+temp;
		mean=tmpSum/totalTemp;
		
		//To find Maximum temperature
		if(maxTemp==null||maxTemp<temp)
		{
			maxTemp=temp;
		}
		
		//To find minimum temperature
		if(minTemp==null||minTemp>temp)
		{
			minTemp=temp;
		}	

		return true;
	}

	public Integer getMax()
	{
		return maxTemp;
	}
	
	public Integer getMin()
	{
		return minTemp;
	}
	
	public float getMean()
	{
		return mean;
	}
	
	public Integer getMode()
	{
		return mode;
	}
	public static void main(String[] args)
	{

		tempTracker tracker=new tempTracker();
		tracker.addTemp(1);
		tracker.addTemp(3);
		tracker.addTemp(6);
		tracker.addTemp(3);
		tracker.addTemp(1);
		tracker.addTemp(3);		
		
		System.out.println("The Maximum Temperature is: "+tracker.getMax());
		System.out.println("The Minimum Temperature is: "+tracker.getMin());		
		System.out.println("The Mean Temperature is: "+tracker.getMean());
		System.out.println("The Mode of Temperature is: "+tracker.getMode());
		
	}
	
}

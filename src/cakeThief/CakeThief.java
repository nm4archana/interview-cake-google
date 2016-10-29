package cakeThief;

/*
 You are a renowned thief who has recently switched from stealing precious metals to stealing cakes because of the insane profit margins. You end up hitting the jackpot, breaking into the world's largest privately owned stock of cakes—the vault of the Queen of England.
While Queen Elizabeth has a limited number of types of cake, she has an unlimited supply of each type.

Each type of cake has a weight and a value, stored in objects of a CakeType class:

  class CakeType {

    int weight;
    int value;

    public CakeType(int weight, int value) {
        this.weight = weight;
        this.value  = value;
    }

}
Java
For example:

  // weighs 7 kilograms and has a value of 160 pounds
new CakeType(7, 160);

// weighs 3 kilograms and has a value of 90 pounds
new CakeType(3, 90);

You brought a duffel bag that can hold limited weight, and you want to make off with the most valuable haul possible.

Write a function maxDuffelBagValue() that takes an array of cake type objects and a weight capacity, and returns the maximum monetary value the duffel bag can hold.

For example:

  CakeType[] cakeTypes = new CakeType[]{
    new CakeType(7, 160),
    new CakeType(3, 90),
    new CakeType(2, 15),
};

int capacity = 20;

maxDuffelBagValue(cakeTypes, capacity);
// returns 555 (6 of the middle type of cake and 1 of the last type of cake)

Weights and values may be any non-negative integer. Yes, it's weird to think about cakes that weigh nothing or duffel bags that can't hold anything. But we're not just super mastermind criminals—we're also meticulous about keeping our algorithms flexible and comprehensive.
 */


public class CakeThief
{
     public int cakeThief(CakeType[] arr,int total)
     {
    	 
    	 int[] tempArr=new int[total+1];
    	 
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 for(int j=1;j<=total;j++)
    		 {
    			 if(arr[i].weight>j)
    			 {
    				 tempArr[j]=Math.max(tempArr[j], 1);
    			 }
    			 else
    			 {
    				 tempArr[j]=Math.max(tempArr[j], arr[i].value+tempArr[j-arr[i].weight]);
    			 }
    		 }
    	 }
    	 return tempArr[total];
     }
     
     public static void main(String[] args)
     {
    	 CakeType[] arr={new CakeType(7, 160),new CakeType(3, 90),new CakeType(2, 15)};
    	 
    	 CakeThief cakeThief=new CakeThief();
    	 
    	 System.out.println("The value of cakes stolen is: "+cakeThief.cakeThief(arr, 20));
    	 
     }
     
     }
     
    

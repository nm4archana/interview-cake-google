package findUniqueDeliveryId;

/*Your company delivers breakfast via autonomous quadcopter drones. And something mysterious has happened.
Each breakfast delivery is assigned a unique ID, a positive integer. When one of the company's 100 drones takes off with a delivery, the delivery's ID is added to an array, deliveryIdConfirmations. When the drone comes back and lands, the ID is again added to the same array.

After breakfast this morning there were only 99 drones on the tarmac. One of the drones never made it back from a delivery. We suspect a secret agent from Amazon placed an order and stole one of our patented drones. To track them down, we need to find their delivery ID.

Given the array of IDs, which contains many duplicate integers and one unique integer, find the unique integer.

The IDs are not guaranteed to be sorted or sequential. Orders aren't always fulfilled in the order they were received, and some deliveries get cancelled before takeoff.

*/

public class findUniqueDeliveryId {

	public int findUniqueDeliveryID(int[] arr)
	{
		int uniqueId=0;
		
		for(int i=0;i<arr.length;i++)
		{
			uniqueId=uniqueId^arr[i];
		}
		
		return uniqueId;
	}
	
	public static void main(String[] args)
	{
		int[] arr={6,1,5,2,3,3,5,1,6};
		findUniqueDeliveryId deliveryId=new findUniqueDeliveryId();
		
		System.out.println("The unique ID is: "+deliveryId.findUniqueDeliveryID(arr));
	}
	
	
}

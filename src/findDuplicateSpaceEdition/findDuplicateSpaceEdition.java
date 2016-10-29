package findDuplicateSpaceEdition;

public class findDuplicateSpaceEdition
{

     public int FindDuplicateEdition(int[] arr,int startIndx,int endIndx)
     {	 
    	 while(startIndx<endIndx)
    	 {
    		 int subArrCount=0;
    		 int mid=(startIndx+endIndx)/2;
    				 
    		 for(int i=0;i<arr.length;i++)
    		 {
    			 if(arr[i]<=mid+1&&arr[i]>startIndx)
    			 {
    				 subArrCount=subArrCount+1;
    			 }
    		 }
    		 
    		 int possibleDistIntegers=mid-startIndx+1;
    		 
    		 if(subArrCount>possibleDistIntegers)
    		 {
    			 endIndx=mid;	 
    		 }
    		 else
    		 {
    			 startIndx=mid+1;
       		 }
    	 }
    	 
    	 return arr[startIndx];
     }
     
     public static void main(String[] args)
     {
    	 int[] arr={1,1,3,5,4,6,2};
    	 findDuplicateSpaceEdition edition=new findDuplicateSpaceEdition();
    	 System.out.println("The duplicated number is: "+edition.FindDuplicateEdition(arr, 0, arr.length-1));
     }
	
}


public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 12, 13, 15};
        int[] descArr = {15, 13, 12, 10, 9, 7, 4, 2, 1};
        int empty[]= {};
        int arr1[]= {1,2,3,3,5,7};

        int number = 7;
        int num2=1;
        int num3=7;
        
        int index = getIndexFromAscendingBinarySearch(arr, number);
        System.out.println(index == -1 ? ("The number " + number + " is not present in the array."):
                ("Got the number "+ number +" at index position "+index));
        
        index=getIndexFromDescendingBinarySearch(descArr,num2 );
        System.out.println(index == -1 ? ("The number " + num2 + " is not present in the array."):
            ("Got the number "+ num2 +" at index position "+index));
        
       index= getFirstIndexBinarySearchAscending(arr, num3);
       System.out.println(index == -1 ? ("The number " + num3 + " is not present in the array."):
           ("Got the number "+ num3 +" at index position "+index));
    }

    public static int getIndexFromAscendingBinarySearch(int[] arr, int number){
        int index = -1;

        int l=0, r = arr.length - 1, mid;
        while(l <= r){
            //System.out.println("l = "+l+", r = "+r);
            mid = (l+r)/2;

            if(arr[mid] > number){
                r = mid - 1;
            }
            else if(arr[mid] < number){
                l = mid + 1;
            }
            else {
                index = mid;
                break;
            }
        }

        return index;
    }

    public static int getIndexFromDescendingBinarySearch(int[] arr, int number){
    	int index=-1;
    	int low= 0;
    	int high=arr.length-1;
    	int mid=(low+high)/2;
    	
    	while(low<=high) {
    		if(number>arr[mid]) {
    			high=mid-1;
    		}
    		
    		else if(number<arr[mid]) {
    			low=mid+1;
    		}
    		
    		else {
    			index=mid;
    			break;
    		}
    		mid=(low+high)/2;
    	}
        return index;
    }

    public static int getFirstIndexBinarySearchAscending(int[] arr, int number){
        // If the number is repeated in the array, return the left most index,
        // i.e. for the array
        // {7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 12, 13, 15} -> return 0
    	int index = -1;
    	int leftIndex= -1;
    	int rightIndex=-1;
    	int noOfOccurences=0;
    	
    	int l=0, r = arr.length - 1, mid;
        while(l <= r){
            mid = (l+r)/2;

            if(arr[mid] > number){
                r = mid - 1;
            }
            else if(arr[mid] < number){
                l = mid + 1;
            }
            else if(arr[mid]==number){
            	leftIndex=findLeftIndex(arr,mid, number);
            	System.out.println("left index is "+leftIndex);
            	rightIndex=findRightIndex(arr,mid,number);
            	System.out.println("Right index is "+rightIndex);
            	noOfOccurences= rightIndex-leftIndex+1;
            	System.out.println("number of occurences "+noOfOccurences);
                break;
            }
        }

        return leftIndex;
    	
    }

	private static int findRightIndex(int[] arr, int mid, int number) {
		int index=mid;
		mid++;
		  while(mid<= arr.length-1 && arr[mid]==number) {
			  index=mid;
			  mid++;
		  }
		  return index;
		}
	

	private static int findLeftIndex(int[] arr, int mid, int number) {
		int index=mid;
		mid--;
	  while( mid>=0 && arr[mid]==number) {
		  index=mid;
		  mid--;
	  }
	  return index;
	}
}



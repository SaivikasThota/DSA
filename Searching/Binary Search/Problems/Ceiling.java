package codes;

public class minnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {1,3,5,7,9,11,15,18,24,27};
	
	int target=25;
	System.out.println(findElement(arr,target));
		
	}

	private static int findElement(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int start=0;
		int end=arr.length-1;
		int temp=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target) {
				return arr[mid];
			}
			else if(arr[mid]>target) {
				end=mid-1;
				temp=end;
			}
			else if(arr[mid]<target) {
				start=mid+1;
				temp=start;
			}
			//Here it will return the next element of temp
			//Here we can use start to print next element becasue it is going on searching for arr[mid==rarget]
			//arr[mid]< target start will increase and while statement exits (it comes out from start<=end)
			//similarly we can find floor of a number using arr[end] becasue suppose we are searching for 5, IN 1,2,3,4,6,7,8,9
			//END WILL BE AT 4 AND START WILL BE AT 6
		}return arr[start];
	
		
	}
	
	
	
	

}
		
	



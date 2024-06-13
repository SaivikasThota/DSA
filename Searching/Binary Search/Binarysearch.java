package codes;

public class minnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,4,3,2,1};
		int target=37;
	
	
	System.out.println(ordersearch(arr,target));
		
	}

	private static int ordersearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		
		int start=0;
		int end=arr.length-1;
    //Checkign if it is ascending sorted array or descending sorted array
		boolean ascending=ascending(arr);
		while(start<=end) {
			int mid=start+(end-start)/2;

      //In any case ascending or descending this condition will be the same
			if(arr[mid]==target) {
				return mid;
			}	

      // 1,2,3,4,5
      // for ex target is 5
      // 3<5
      // start=mid+1;
      // start=4
      // Ascending
			if(ascending) {
			  if(arr[mid]>target) {
				end=mid-1;
			  }else if(arr[mid]<target){
				start=mid+1;
			}
      }
      // 5,4,3,2,1
      // for ex target is 5
      // 3<5
      // end=mid-1;
      // end=2
      // Descending
      else if(!ascending){	
				if(arr[mid]<target) {
					end=mid-1;
				}else if(arr[mid]>target){
					start=mid+1;
				}
			}
			
			
			
			
		}
		return -1;
		
		
	}

	private static boolean ascending(int[] arr) {
		// TODO Auto-generated method stub
		
		if(arr[0]<arr[arr.length-1]) {
			return true;
		}
		return false;
		
	}

}
		
	



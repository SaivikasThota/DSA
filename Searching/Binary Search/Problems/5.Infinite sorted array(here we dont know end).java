//We are going to find out end value using bottom up
//1,2,3,4,5,6,7,8,9
//in binary search we divided by half
  //here we are going to increase chunk by chunk
  //like first we search 1,2--2 elements
  //then 3,4,5,6--> 4 elements
  //then 7,8,9,10,11,12,13,14--> 8 elements

//if the elements is 11 it is in that chunk(find the binary search thats it)




package codes;

import java.util.Arrays;

class minnum {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		int target=6;
   elements(nums,target);
   
 
	}
    private static void elements(int[] nums, int target) {
		int start=0;
		int end=1;
		//1,2,3,4,5,6,7,8
				while(target>nums[end]) {
          //start=end+1
					int temp=end+1;
          //end=end+double of n--> if end of 1st iteration is 2, then end of 2nd iteration should be 6
					end=end+(end-start+1)*2;
					start=temp;
					
				}
				
				int ans=searching(nums,target,start,end);
				System.out.println(ans);

		
	}
	static int searching(int nums[],int target,int start,int end){
    	
//            int start=0;
//            int end=nums.length-1;
//            
            int ans=-1;
            while(start<=end){
            	int mid=start+(end-start)/2;
                if(nums[mid]==target){
                	ans=mid;
                    return ans;
                    
                }else if(nums[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
			return ans;

    }}






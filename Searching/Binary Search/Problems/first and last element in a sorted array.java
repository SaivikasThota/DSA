class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        arr[0]=searching(nums,target,true);
        arr[1]=searching(nums,target,false);
return arr;
    }
    int searching(int nums[],int target,boolean startedelement){
            int start=0;
            int end=nums.length-1;
            
            int ans=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
              //Once we find out a target
                if(nums[mid]==target){
                    ans=mid;
                  //end means it will go to left, any how we ae in nums[mid]==target
                    if(startedelement){
                        end=mid-1;
                    }
                    //Start means it will go to right, any how we ae in nums[mid]==target
                    else{
                        start=mid+1;
                    }
                }else if(nums[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
return ans;
    }}

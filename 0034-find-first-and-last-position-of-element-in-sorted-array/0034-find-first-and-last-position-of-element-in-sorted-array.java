class Solution {
   public static int search(int[] nums, int target, boolean isSearchingLeft){
        int l=0;
        int r=nums.length-1;
        int idx = -1;
        while(l<=r){
           int mid = l+(r-l)/2;
           if(nums[mid]>target) r=mid-1;
           else if(nums[mid]<target) l=mid+1;
           else{
            idx = mid;
            if(isSearchingLeft) r=mid-1;
            else l=mid+1;
           }
           
        }
        return idx;
   }
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int left = search(nums,target,true);
        int right = search(nums,target,false);
        result[0] = left;
        result[1] = right;
        return result;
    }
}
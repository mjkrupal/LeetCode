class Solution {
    public int[] transformArray(int[] nums) {
        int j=0;
        int ans[] = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]%2==0) ans[j++]=0;
        }
        while(j<nums.length){
            ans[j++] = 1;
        }
        return ans;
    }
}
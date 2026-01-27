class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int pos =0;
        for(int i=0;i<n;i++){
            ans[pos++]=nums[i];
            ans[pos++] = nums[i+n];
        }
        return ans;
    }
}
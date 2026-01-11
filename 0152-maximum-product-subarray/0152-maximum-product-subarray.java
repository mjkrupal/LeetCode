class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prefix = (prefix==0?1:prefix)*nums[i];
            suffix = (suffix==0?1:suffix)*nums[nums.length-1-i];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}
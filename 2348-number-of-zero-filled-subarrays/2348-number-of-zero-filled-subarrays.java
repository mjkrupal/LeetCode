class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int zeroCount=0;
        for(int num:nums){
            if(num==0) zeroCount++;
            else {
                ans += zeroCount *(zeroCount + 1L)/2;
                zeroCount=0;
            }
        }
        ans += zeroCount *(zeroCount + 1L)/2;
        return ans;
    }
}
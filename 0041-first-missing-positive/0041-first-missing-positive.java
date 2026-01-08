class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int positivenum = 1;
        for(int num:nums){
            if(num==positivenum) positivenum++;
            else if(num > positivenum) return positivenum;
        }
        return positivenum;
    }
}
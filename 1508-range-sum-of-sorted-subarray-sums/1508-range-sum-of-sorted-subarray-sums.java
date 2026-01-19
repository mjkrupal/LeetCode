class Solution {
        static final int MOD=1_000_000_007;
    public int rangeSum(int[] nums, int n, int left, int right) {
         List<Integer> arr = new ArrayList<>();
         int sum;
         for(int i=0;i<n;i++){
           sum = 0;
            for(int j = i;j<n;j++){
                sum+=nums[j];
                arr.add(sum);
            }
         }
         Collections.sort(arr);
         int totalsum = 0;
         for(int i=left-1;i<right;i++){
            totalsum=(totalsum+arr.get(i))%MOD;
         }
         return (int) totalsum;
    }
}
class Solution {
    public static void threepointer(int[] nums, int b, int c, int target, List<List<Integer>> list){
        while(b<c){
            if(nums[b]+nums[c]==target){
                list.add(new ArrayList<>());
                list.get(list.size()-1).add(-target);
                list.get(list.size()-1).add(nums[b]);
                list.get(list.size()-1).add(nums[c]);
                b++;
                while(b<c && nums[b]==nums[b-1]) b++;
            }else if(nums[b]+nums[c]>target) c--;
            else b++;
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            threepointer(nums,i+1,nums.length-1,-nums[i],list);
        }
        return list;
    }
}
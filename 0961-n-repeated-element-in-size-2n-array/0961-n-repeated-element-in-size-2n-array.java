class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length/2;
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            if(map.containsKey(key)){
                return key;
            }
            map.put(key, map.getOrDefault(key,0)+1);
        }
        
        return -1;
    }
}
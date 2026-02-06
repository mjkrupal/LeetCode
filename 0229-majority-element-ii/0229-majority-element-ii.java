class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int freq1=0, ele1=0;
        int freq2=0, ele2=0;
        for(int i=0;i<nums.length;i++){
            if(freq1==0 && nums[i]!=ele2){
                freq1=1;
                ele1=nums[i];
            } else if(freq2==0 && nums[i]!=ele1){
                freq2=1;
                ele2=nums[i];
            }else if(ele1==nums[i]) freq1++;
            else if (ele2==nums[i]) freq2++;
            else{
                freq1--;
                freq2--;
            }
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1) count1++;
            else if(nums[i]==ele2) count2++;
        }
        int max = (int) Math.floor(nums.length/3);
        List<Integer> res = new ArrayList<Integer>();
        if(count1 > max) res.add(ele1);
        if(count2 > max) res.add(ele2);

        return res;
    }
}
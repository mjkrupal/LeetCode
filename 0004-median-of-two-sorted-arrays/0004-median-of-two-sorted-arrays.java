class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int[] numsMerged = new int[nums1.length+nums2.length];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            numsMerged[index]=nums1[i];
            index++;
        }
         for(int i=0;i<nums2.length;i++){
            numsMerged[index]=nums2[i];
            index++;
        }
        Arrays.sort(numsMerged);
        int n=numsMerged.length;
        if(n%2==0){
            median = (numsMerged[n/2]+numsMerged[(n/2)-1])/2.0;
        }else{
            median =  numsMerged[n/2];
        }
        return median;
    }
}
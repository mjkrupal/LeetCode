class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];  
        int i = 0;
        boolean flag = (n%2 == 0);
        for(i=0;i<n;i+=2){
            if(!flag && i == n-1)
                break;
            arr[i] = i+1;
            arr[i+1] = -(i+1);
        }
        if(!flag)
            arr[i] = 0;
        return arr;
    }
}
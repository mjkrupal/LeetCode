class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        for(i=0;i<arr.length && j<spaces.length;i++){
            if(i==spaces[j]){
                sb.append(" ");
                sb.append(arr[i]);
                j++;
            }else{
                sb.append(arr[i]);
            }
        }
        while(i<arr.length){
            sb.append(arr[i]);
            i++;
        }
        return sb.toString();
    }
}
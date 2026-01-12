class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        for(i=0;i<s.length();i++){
            if(j < spaces.length && i == spaces[j]){
                sb.append(" ");
                j++;
            }sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}
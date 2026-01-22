class Solution {
    public boolean vowelornot(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'; 
    }
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && !vowelornot(array[left])){
                left++;
            }
            while(left<right && !vowelornot(array[right])){
                right--;
            }
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return new String(array);
    }
}
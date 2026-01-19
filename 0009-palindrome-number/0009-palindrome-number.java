class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int reverse = 0;
        while(x>0){
            int remainder = x%10;
            reverse = reverse*10+remainder;
            x/=10;
        }
        boolean isPalindrome = false;
        if(originalNumber == reverse) isPalindrome = true;
        return isPalindrome;
    }
}
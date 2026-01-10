bool isPalindrome(int x) {
     long int m=x,rev=0;
    while(m>0){
        int d=m%10;
        rev=rev*10+d;
        m/=10;
    }
    if(rev<-2147483648 || rev>2147483648) rev=0;
    if(rev==x) return 1;
    else return 0;
}
bool isPowerOfThree(int n) {
   long int p = 0 , i = 0;
    while(p <= n){
        p = pow(3 , i);
        i++;
        if(p == n) return true;
    }
    return false;
}
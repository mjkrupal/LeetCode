class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();

        int carry=0;
        int index=num.length-1;
        while(index >=0 || k >0){
            int digitinNums = index<0?0:num[index];
            int digitfromK = k%10;
            int sum = digitinNums+digitfromK+carry;
            int firstDigitinSum = sum%10;
            list.add(firstDigitinSum);
            carry = sum>9?1:0;
            index--;
            k/=10;
        }
        if(carry==1) list.add(carry);
        Collections.reverse(list);
        return list;
        
    }
}
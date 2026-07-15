class Solution {
    private int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int even=0,odd=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                even+=i;
            }
            if(i%2!=0){
                odd+=i;
            }
        }
        return gcd(odd,even);
    }
}
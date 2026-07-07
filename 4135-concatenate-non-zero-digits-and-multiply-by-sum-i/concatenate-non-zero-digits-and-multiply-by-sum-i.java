class Solution {
    public long sumAndMultiply(int n) {
        long prod=1;
        long sum=0,x=0;
        while(n>0){
            int v=n%10;
            if(v!=0){
                x+=v*prod;
                prod*=10;
                sum+=v;
            }
            n/=10;
        }
        return x*sum;
    }
}
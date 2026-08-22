class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int a=n;
        while(n>0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        return a%(sum+prod)==0;
    }
}
class Solution {
    public int smallestNumber(int n, int t) {
        int a=-1;
        for(int i=n;i<=n+10;i++){
            int prod=1;
            int temp=i;
            while(temp>0){
                prod*=temp%10;
                temp/=10;
            }
            if(prod%t==0){
                a=i;
                break;
            }
        }
        return a;
    }
}
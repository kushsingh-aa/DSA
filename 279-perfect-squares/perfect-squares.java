class Solution {
    public int square(int n){
        return 0;
    }

    public int numSquares(int n) {
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=i;
            for(int j=1;j*j<=i;j++){
                int sq=j*j;
                a[i]=Math.min(a[i],a[i-sq]+1);
            }
        }
        return a[n];
    }
}
class Solution {
    // public int square(int n){
    //     return 0;
    // }

    // public int numSquares(int n) {
    //     int[] a=new int[n+1];
    //     for(int i=1;i<=n;i++){
    //         a[i]=i;
    //         for(int j=1;j*j<=i;j++){
    //             int sq=j*j;
    //             a[i]=Math.min(a[i],a[i-sq]+1);
    //         }
    //     }
    //     return a[n];
    // }
    public boolean square(int n){
        int s=(int)Math.sqrt(n);
        return s*s==n;
    }
    public int numSquares(int n){
        if(square(n)) return 1;
        while(n%4==0) n/=4;
        if(n%8==7) return 4;
        for(int i=1;i*i<n;i++){
            if(square(n-(i*i))) return 2;
        }
        return 3;
    }
}
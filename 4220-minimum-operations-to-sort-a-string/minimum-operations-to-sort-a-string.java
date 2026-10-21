class Solution {
    public int minOperations(String s) {
        boolean isSorted=true;
        char []arr=s.toCharArray();
        int n=arr.length;
        char mn=arr[0];
        char mx=arr[0];
        for(int i=1;i<n;i++){
            mn=(char)Math.min(mn,arr[i]);
            mx=(char)Math.max(mx,arr[i]);
            if(arr[i]<arr[i-1]){
                isSorted=false;
            }
        }
        if(isSorted) return 0;
        if(n==2) return -1;
        if(arr[0]==mn || arr[n-1]==mx) return 1;
        for(int i=1;i<n-1;i++){
            if(arr[i]==mn || arr[i]==mx){
                return 2;
            }
        }
        return 3;
    }
}
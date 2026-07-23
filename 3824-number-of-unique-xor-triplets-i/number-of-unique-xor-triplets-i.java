class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<3) return n;
        int p=1;
        while(p<=n){
            if(p>Integer.MAX_VALUE/2){
                break;
            }
            p*=2;
        }
        return p;
    }
}
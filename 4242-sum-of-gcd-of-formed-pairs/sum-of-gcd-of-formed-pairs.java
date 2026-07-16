class Solution {
    private int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            ans[i]=gcd(nums[i],mx);
        }
        Arrays.sort(ans);
        long res=0;
        int l=0,r=n-1;
        while(r>l){
            res+=gcd(ans[l],ans[r]);
            l++;
            r--;
        }
        return res;
    }
}
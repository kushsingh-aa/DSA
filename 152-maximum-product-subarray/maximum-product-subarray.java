class Solution {
    public int maxProduct(int[] nums) {
        int mx=nums[0];
        int mn=nums[0];
        int mxAns=nums[0];
        for(int i=1;i<nums.length;i++){
            int c=nums[i];
            if(c<0){
                int temp=mx;
                mx=mn;
                mn=temp;
            }
            mx=Math.max(c,mx*c);
            mn=Math.min(c,mn*c);

            mxAns=Math.max(mxAns,mx);
        }
        return mxAns;
    }
}
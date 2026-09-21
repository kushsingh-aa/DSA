class Solution {
    public long[] resultArray(int[] nums, int k) {
        // long[] ans=new long[k];
        // for(int i=0;i<nums.length;i++){
        //     long prod=1;
        //     for(int j=i;j<nums.length;j++){
        //         prod=(prod*nums[j])%k;
        //         ans[(int)prod]++;
        //     }
        // }
        // return ans;
        
        long[] dp=new long[k];
        long[] ans=new long[k];
        for(int num:nums){
            long[] newDp=new long[k];
            int numMod=num%k;
            newDp[numMod]++;
            for(int i=0;i<k;i++){
                int newRem=(int)((long)i*numMod%k);
                newDp[newRem]+=dp[i];
            }
            for(int i=0;i<k;i++){
                ans[i]+=newDp[i];
            }
            dp=newDp;
        }
        return ans;

    }
}
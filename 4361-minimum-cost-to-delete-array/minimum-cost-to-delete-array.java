class Solution {
    public long minCost(int[] nums) {
        int n=nums.length;
        long ans=(long)nums[0]+(long)nums[n-1];

        long negsum=0;
        long negcnt=0;
        long smallestAbs=Long.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            if(nums[i]<0){
                negsum+=nums[i];
                negcnt++;
            }
            smallestAbs=Math.min(smallestAbs,(long)nums[i]>=0?(long)nums[i]:(long)(-nums[i]));
        }
        ans+=negsum;
        if(negcnt%2==1) ans+=smallestAbs;
        return ans;
    }
}
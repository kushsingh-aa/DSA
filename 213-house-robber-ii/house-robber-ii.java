class Solution {
    public int rec(int[] nums,int l,int r,int[] memo){
        if(l>=r) return 0;
        if(memo[l]!=-1) return memo[l];
        int robHouse=nums[l]+rec(nums,l+2,r,memo);
        int notRobHouse=rec(nums,l+1,r,memo);
        return memo[l]=Math.max(robHouse,notRobHouse);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] memo1=new int[n];
        Arrays.fill(memo1,-1);
        int[] memo2=new int[n];
        Arrays.fill(memo2,-1);
        return Math.max(rec(nums,0,n-1,memo1),rec(nums,1,n,memo2));
    }
}
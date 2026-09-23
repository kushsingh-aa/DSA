class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int target=sum-x;
        int i=0;
        int len=-1;
        int curSum=0;
        for(int j=0;j<nums.length;j++){
            curSum+=nums[j];
            while(curSum>target && j>=i){
                curSum-=nums[i];
                i++;
            }
            if(curSum==target){
                len=Math.max(len,j-i+1);
            }
        }
        return len==-1?-1:nums.length-len;
    }
}
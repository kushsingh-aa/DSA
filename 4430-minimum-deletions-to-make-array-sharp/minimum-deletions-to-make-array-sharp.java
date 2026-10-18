class Solution {
    public int minDeletions(int[] nums) {
        int cnt=0;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if((prev^nums[i])==0){
                cnt++;
            }
            else{
                prev=nums[i];
            }
        }
        return cnt;
    }
}
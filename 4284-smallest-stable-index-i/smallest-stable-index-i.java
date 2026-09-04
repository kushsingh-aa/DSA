class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] min=new int[n];
        min[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            min[n-1-i]=Math.min(min[n-i],nums[n-1-i]);
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
}
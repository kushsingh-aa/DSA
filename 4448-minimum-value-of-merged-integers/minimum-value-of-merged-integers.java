class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i+=2){
            String s=""+nums[i]+nums[i+1];
            int merge=Integer.parseInt(s);
            min=Math.min(min,merge);
        }
        return min;
    }
}
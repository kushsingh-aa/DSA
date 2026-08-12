class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int max=0,i=0;
        for(int j=0;j<nums.length;j++){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);

            while(mp.get(nums[j])>k){
                mp.put(nums[i],mp.get(nums[i])-1);
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
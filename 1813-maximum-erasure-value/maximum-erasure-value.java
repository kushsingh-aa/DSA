class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max=0,cur=0,i=0;
        Set<Integer> st=new HashSet<>();
        for(int j=0;j<nums.length;j++){
            while(st.contains(nums[j])){
                cur-=nums[i];
                st.remove(nums[i]);
                i++;
            }
            st.add(nums[j]);
            cur+=nums[j];
            max=Math.max(max,cur);
        }
        return max;
    }
}
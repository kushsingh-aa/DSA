class Solution {
    public boolean uniformArray(int[] nums1) {
        int mn=Integer.MAX_VALUE;
        for(int num:nums1){
            if(num%2==1){
                mn=Math.min(mn,num);
            }
        }

        for(int num:nums1){
            if(num%2==0 && mn!=Integer.MAX_VALUE && num<mn){
                return false;
            }
        }
        return true;
    }
}
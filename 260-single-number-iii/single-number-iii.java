class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int lowestBit=xor & -xor;
        int[] ans=new int[2];
        for(int num:nums){
            if((lowestBit & num)==0){
                ans[0]^=num;
            }
            else{
                ans[1]^=num;
            }
        }
        return ans;
    }
}
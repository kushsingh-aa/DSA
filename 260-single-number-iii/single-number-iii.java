class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int mask=xor & -xor;
        int first_unique=0;
        int second_unique=0;
        for(int num:nums){
            if((num & mask)==0){
                first_unique^=num;
            }
            else{
                second_unique^=num;
            }
        }
        return new int[]{first_unique,second_unique};
    }
}
class Solution {
    public int longestSubsequence(int[] nums) {
        // int xor=0;
        // boolean Nz=false;
        // for(int num:nums){
        //     xor^=num;
        //     if(num!=0){
        //         Nz=true;
        //     }
        // }
        // if(!Nz) return 0;
        // if(xor!=0){
        //     return nums.length;
        // }
        // return nums.length-1;

        int xor=0;
        int cnt=0;
        for(int num:nums){
            xor^=num;
            if(num==0) cnt++;
        }
        if(xor!=0){
            return nums.length;
        }
        else{
            if(cnt==nums.length) return 0;
        }
        return nums.length-1;

    }
}
class Solution {
    public boolean isArraySpecial(int[] nums) {
        // int a=1;
        // if(nums.length==1){
        //     return true;
        // }
        // for(int i=0;i<nums.length-1;i++){
        //     if((nums[i]%2==0 && nums[i+1]%2==0) || (nums[i]%2!=0 && nums[i+1]%2!=0)){
        //         a=-1;
        //     }
        // }
        // if(a==1) return true;
        // else return false;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]+nums[i+1])%2==0) return false;
        }
        return true;
    }
}
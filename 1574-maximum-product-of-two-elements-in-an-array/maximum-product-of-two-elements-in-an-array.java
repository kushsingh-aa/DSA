class Solution {
    public int maxProduct(int[] nums) {
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             max=Math.max(max,(nums[i]-1)*(nums[j]-1));
        //         }
        //     }
        // }
        // return max;

        // Arrays.sort(nums);
        // return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);

        int mx1=0;
        int mx2=0;
        for(int num:nums){
            if(num>mx1){
                mx2=mx1;
                mx1=num;
            }else if(num>mx2){
                mx2=num;
            }
        }
        return (mx1-1)*(mx2-1);
    }
}
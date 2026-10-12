class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int n=nums.length;
        int max=1;
        for(int i=0;i<n;i++){
            int rem=(nums[i]%k);
            for(int j=i+1;j<n;j++){
                int curRem=(nums[j]%k);
                if(rem!=curRem){
                    break;
                }
                int len=j-i+1;
                if(((len-1)*rem)%k==0){
                    max=Math.max(max,len);
                }    
            }
        }
        return max;
    }
}
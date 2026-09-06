class Solution {
    public int splitArray(int[] nums, int k) {
        int right=0,left=0,mid;
        for(int i:nums){
            left=Math.max(left,i);
            right+=i;
        }

        while(right>left){
            mid=left+(right-left)/2;

            if(canSplit(nums,mid,k)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }

    private boolean canSplit(int[] nums,int mid,int k){
        int cnt=1,total=0;
        for(int i:nums){
            total+=i;
            if(total>mid){
                total=i;
                cnt++;
            }
            if(cnt>k) return false;
        }
        return true;
    }
}
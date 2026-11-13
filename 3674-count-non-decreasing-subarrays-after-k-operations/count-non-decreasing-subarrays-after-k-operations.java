class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n=nums.length;
        long ans=0,cost=0;
        int[] st=new int[n];
        int head=0,top=0,j=n-1;
        for(int i=n-1;i>=0;i--){
            while(head<top && nums[st[top-1]]<nums[i]){
                top--;
                int x=st[top];
                int r=head<top?st[top-1]:j+1;
                cost+=(long)(r-x)*(nums[i]-nums[x]);
            }
            st[top]=i;
            top++;

            while(cost>k){
                cost-=(long)nums[st[head]]-nums[j];
                if(st[head]==j) head++;
                j--;
            }
            ans+=j-i+1;
        }
        return ans;
    }
}
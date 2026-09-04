class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // int n=nums.length;
        // int[] min=new int[n];
        // min[n-1]=nums[n-1];
        // for(int i=1;i<n;i++){
        //     min[n-1-i]=Math.min(min[n-i],nums[n-1-i]);
        // }
        
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     max=Math.max(max,nums[i]);
        //     if(max-min[i]<=k){
        //         return i;
        //     }
        // }
        // return -1;

        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int min=nums[n-1];
        for(int i=n-1;i>=0;i--){
            min=Math.min(nums[i],min);
            st.push(min);
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            if(max-st.peek()<=k){
                return i;
            }
            st.pop();
        }
        return -1;
    }
}
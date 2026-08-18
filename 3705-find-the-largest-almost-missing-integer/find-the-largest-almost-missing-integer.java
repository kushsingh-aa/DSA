class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==n){
            int ans=-1;
            for(int num:nums){
                ans=Math.max(ans,num);
            }
            return ans;
        }

        if(k==1){
            Map<Integer,Integer> mp=new HashMap<>();
            for(int num:nums){
                mp.put(num,mp.getOrDefault(num,0)+1);
            }
            int ans=-1;
            for(int num:mp.keySet()){
                if(mp.get(num)==1){
                    ans=Math.max(ans,num);
                }
            }
            return ans;
        }

        int first=nums[0];
        int last=nums[n-1];
        int fcnt=0;
        int lcnt=0;
        for(int num:nums){
            if(num==first) fcnt++;
            if(num==last) lcnt++;
        }

        if(first==last){
            return fcnt==1?first:-1;
        }
        
        int ans=-1;
        if(fcnt==1) ans=Math.max(ans,first);
        if(lcnt==1) ans=Math.max(ans,last);

        return ans;
    }
}
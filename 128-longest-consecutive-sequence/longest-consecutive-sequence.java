class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length==0) return 0;
        // Arrays.sort(nums);
        // int len=1;
        // int cur=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         continue;
        //     }
        //     if(nums[i]==nums[i-1]+1){
        //         cur++;
        //     }else{
        //         len=Math.max(len,cur);
        //         cur=1;
        //     }
        // }
        // return Math.max(len,cur);

        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int len=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curNum=num;
                int curlen=1;
            
                while(set.contains(curNum+1)){
                    curNum++;
                    curlen++;
                }
                len=Math.max(len,curlen);
            }
        }
        return len;
    }
}
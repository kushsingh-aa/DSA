class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
        // List<Integer> l=new ArrayList<>();
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=nums[i]+1;j<nums[i+1];j++){
        //         l.add(j);
        //     }
        // }
        // return l;

        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            mn=Math.min(mn,num);
            mx=Math.max(mx,num);
            set.add(num);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=mn+1;i<mx;i++){
            if(!set.contains(i)){
                l.add(i);
            }
        }
        return l;

    }
}
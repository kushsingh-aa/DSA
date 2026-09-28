class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int max=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            max=Math.max(max,mp.get(nums[i]));
        }
        List<Integer> list=new ArrayList<>(mp.keySet());
        Collections.sort(list);

        int index=0;
        for(int i=1;i<=max;i++){
            for(int num:list){
                if(mp.get(num)>=i){
                    ans[index++]=num;
                }
            }
        }
        return ans;
    }
}
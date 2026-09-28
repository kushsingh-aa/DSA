class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        int []ans=new int[nums.length];
        int index=0;
        while(!list.isEmpty()){
            Set<Integer> set=new HashSet<>(list);
            List<Integer> unique=new ArrayList<>(set);
            Collections.sort(unique);
            for(int ele:unique){
                ans[index++]=ele;
                list.remove(Integer.valueOf(ele));
            }
        }
        return ans;
    }
}
class Solution {
    public int missingMultiple(int[] nums, int k) {
        // HashSet<Integer> set=new HashSet<>();
        // for(int num:nums){
        //     set.add(num);
        // }
        // int a=k;
        // while(set.contains(a)){
        //     a+=k;
        // }
        // return a;
        Arrays.sort(nums);
        int a=k;
        for(int num:nums){
            if(num==a){
                a+=k;
            }
        }
        return a;
    }
}
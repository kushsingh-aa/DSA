class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int[] f=new int[51];
        for(int i=0;i<=n-k;i++){
           Set<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++) set.add(nums[j]);
            for(int x:set) f[x]++;
        }
        for(int i=50;i>=0;i--){
            if(f[i]==1) return i;
        }
        return -1;
    }
}
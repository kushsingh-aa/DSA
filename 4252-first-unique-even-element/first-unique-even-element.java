class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            if(num%2==0){
                mp.put(num,mp.getOrDefault(num,0)+1);
            }
        }
        for(int x:nums){
            if(mp.getOrDefault(x,0)==1){
                return x;
            }
        }
        return -1;
    }
}
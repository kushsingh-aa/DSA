class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return -1;
    }
}
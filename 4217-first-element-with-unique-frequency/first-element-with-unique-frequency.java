class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        Map<Integer,Integer> freqCount=new HashMap<>();
        for(int f:freq.values()){
            freqCount.put(f,freqCount.getOrDefault(f,0)+1);
        }

        for(int x:nums){
            if(freqCount.get(freq.get(x))==1){
                return x;
            }
        }
        return -1;
    }
}
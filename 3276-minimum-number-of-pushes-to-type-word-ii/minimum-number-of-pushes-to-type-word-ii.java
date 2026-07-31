class Solution {
    public int minimumPushes(String word) {
        int cnt=0;
        int[] freq=new int[26];
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        for(int i=0;i<26;i++){
            int cur=freq[26-i-1];
            if(cur==0){
                break;
            }
            cnt+=(i/8+1)*cur;
        }
        return cnt;
    }
}
class Solution {
    public int maxFreqSum(String s) {
        int[] cnt=new int[26];
        int vowel=0;
        int cons=0;
        for(char c:s.toCharArray()){
            cnt[c-'a']++;
        }
        for(char c='a';c<='z';c++){
            int freq=cnt[c-'a'];
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel=Math.max(vowel,freq);
            }
            else{
                cons=Math.max(cons,freq);
            }
        }
        return cons+vowel;
    }
}
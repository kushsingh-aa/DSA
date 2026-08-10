class Solution {
    public int longestPalindrome(String s) {
        int[] cnt=new int[128];
        for(char c:s.toCharArray()){
            cnt[c]++;
        }
        int n=0;
        for(int i:cnt){
            n+=(i/2)*2;
        }
        if(n<s.length()){
            n++;
        }
        return n;
    }
}
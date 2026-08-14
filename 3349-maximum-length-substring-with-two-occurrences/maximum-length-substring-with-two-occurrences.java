class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0,i=0;
        int[] cnt=new int[26];
        for(int j=0;j<s.length();j++){
            int r=s.charAt(j)-'a';
            cnt[r]++;
            while(cnt[r]>2){
                int l=s.charAt(i)-'a';
                cnt[l]--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
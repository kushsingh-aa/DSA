class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int len=Math.min(n1,n2);
        int cnt=0;
        StringBuilder sb=new StringBuilder();
        while(cnt<len){
            sb.append(word1.charAt(cnt));
            sb.append(word2.charAt(cnt));
            cnt++;
        }
        sb.append(word1.substring(cnt));
        sb.append(word2.substring(cnt));
        return sb.toString();
    }
}
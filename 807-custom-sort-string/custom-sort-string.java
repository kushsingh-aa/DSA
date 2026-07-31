class Solution {
    public String customSortString(String order, String s) {
        int[] f=new int[26];
        for(char c:s.toCharArray()){
            f[c-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:order.toCharArray()){
            while(f[c-'a']>0){
                sb.append(c);
                f[c-'a']--;
            }
        }
        for(char c='a';c<='z';c++){
            while(f[c-'a']>0){
                sb.append(c);
                f[c-'a']--;
            }
        }
        return sb.toString();
    }
}
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] nw=new int[26];
        for(int i=0;i<s.length();i++){
            nw[s.charAt(i)-'a']=i;
        }
        boolean[] used=new boolean[26];
        StringBuilder sb=new StringBuilder();
        for(int idx=0;idx<s.length();idx++){
            char ch=s.charAt(idx);
            int i=ch-'a';
            if(used[i]) continue;

            while(sb.length()>0 && sb.charAt(sb.length()-1)>ch && nw[sb.charAt(sb.length()-1)-'a']>idx){
                char rem=sb.charAt(sb.length()-1);
                used[rem-'a']=false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(ch);
            used[i]=true;
        }
        return sb.toString();
    }
}
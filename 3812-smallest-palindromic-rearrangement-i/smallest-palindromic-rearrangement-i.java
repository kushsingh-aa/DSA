class Solution {
    public String smallestPalindrome(String s) {
       int freq[]=new int[26];
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
        } 
        StringBuilder sb=new StringBuilder();
        char mid=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0) continue;
            if(freq[i]%2==1){
                mid=(char)(i+'a');
            }
            int half=freq[i]/2;
            for(int j=0;j<half;j++){
                sb.append((char)(i+'a'));
            }
        }
        String first=sb.toString();
        String second=sb.reverse().toString();
        if(mid!=0){
            return first+mid+second;
        }
        return first+second;
    }
}
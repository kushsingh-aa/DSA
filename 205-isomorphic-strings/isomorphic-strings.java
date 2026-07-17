class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] S=new int[256];
        int[] T=new int[256];
        for(int i=0;i<s.length();i++){
            char charS=s.charAt(i);
            char charT=t.charAt(i);
            if(S[charS]!=T[charT]){
                return false;
            }
            S[charS]=i+1;
            T[charT]=i+1;
        }
        return true;
    }
}
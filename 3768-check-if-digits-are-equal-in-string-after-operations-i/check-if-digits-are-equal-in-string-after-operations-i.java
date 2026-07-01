class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String ans="";
            for(int i=0;i<s.length()-1;i++){
                int first=s.charAt(i);
                int second=s.charAt(i+1);
                ans+=(first+second)%10;
            }
            s=ans;
        }
        return s.charAt(0)==s.charAt(1);
    }
}
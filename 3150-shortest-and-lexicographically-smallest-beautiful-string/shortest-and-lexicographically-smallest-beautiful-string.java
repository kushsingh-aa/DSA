class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int left=0,right=0;
        String res="";
        int cnt=0;
        while(n>right){
            if(s.charAt(right)=='1'){
                cnt++;
            }

            while(cnt>k || (left<right && s.charAt(left)=='0')){
                if(s.charAt(left)=='1'){
                    cnt--;
                }
                left++;
            }

            if(cnt==k){
                String cur=s.substring(left,right+1);
                if(res.equals("") || cur.length()<res.length() || (cur.length()==res.length() && cur.compareTo(res)<0)){
                    res=cur;
                }
            }
            right++;
        }
        return res;
    }
}
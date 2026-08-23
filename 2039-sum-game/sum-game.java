class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int left=0;
        int right=0;
        int lQ=0;
        int rQ=0;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                lQ++;
            }
            else{
                left+=num.charAt(i)-'0';
            }
        }
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                rQ++;
            }
            else{
                right+=num.charAt(i)-'0';
            }
        }
        return (left-right)!=((rQ-lQ))*9/2.0;
    }
}
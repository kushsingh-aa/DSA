class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='*'){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt<0){
                return false;
            }
        }
        int closeCnt=0;
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==')' || c=='*'){
                closeCnt++;
            }else{
                closeCnt--;
            }
            if(closeCnt<0){
                return false;
            }
        }
        return true;
    }
}
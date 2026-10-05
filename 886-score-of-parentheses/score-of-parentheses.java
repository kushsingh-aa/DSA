class Solution {
    public int scoreOfParentheses(String s) {
        int cnt=0;
        int score=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
            }else{
                cnt--;
                if(s.charAt(i-1)=='('){
                    score+=Math.pow(2,cnt);
                }
            }
        }
        return score;
    }
}
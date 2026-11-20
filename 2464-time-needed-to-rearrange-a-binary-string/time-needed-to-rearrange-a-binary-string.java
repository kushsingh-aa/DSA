class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int zeroCnt=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') zeroCnt++;
            if(s.charAt(i)=='1' && zeroCnt>0){
                cnt=Math.max(cnt+1,zeroCnt);
            }
        }
        return cnt;
    }
}
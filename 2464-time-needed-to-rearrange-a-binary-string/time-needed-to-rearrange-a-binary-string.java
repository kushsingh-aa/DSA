class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int cnt=0;
        while(s.indexOf("01")>=0){
            s=s.replace("01","10");
            cnt++;
        }
        return cnt;
    }
}
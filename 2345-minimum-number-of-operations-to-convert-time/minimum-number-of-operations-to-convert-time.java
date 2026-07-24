class Solution {
    private int min(String s){
        int hrs=Integer.parseInt(s.substring(0,2));
        int mins=Integer.parseInt(s.substring(3,5));
        return (hrs*60)+mins;
    }
    public int convertTime(String current, String correct) {
        int curMin=min(current);
        int corMin=min(correct);
        int d=corMin-curMin;
        int cnt=0;
        int[] time={60,15,5,1};
        for(int t:time){
            cnt+=d/t;
            d%=t;
        }
        return cnt;
    }
}
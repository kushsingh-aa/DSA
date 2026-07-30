class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int cnt=0;
        int box=n/8;
        int d=n%8;
        for(int i=1;i<=box;i++){
            cnt+=i*8;
        }
        cnt+=d*(box+1);
        return cnt;
    }
}
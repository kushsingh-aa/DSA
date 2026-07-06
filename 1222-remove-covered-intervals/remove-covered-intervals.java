class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });
        int cnt=0;
        int end=-1;
        for(int[] i:intervals){
            if(i[1]>end){
                cnt++;
                end=i[1];
            }
        }
        return cnt;
    }
}
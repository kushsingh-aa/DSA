class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] a=new int[3];
        Arrays.fill(a,0);
        for(int stone:stones){
            a[stone%3]++;
        }
        if(a[0]%2==0){
            return Math.min(a[1],a[2])>0;
        }
        return Math.abs(a[1]-a[2])>2;
    }
}
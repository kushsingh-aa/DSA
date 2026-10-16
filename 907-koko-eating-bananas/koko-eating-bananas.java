class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Integer.MIN_VALUE;
        for(int p:piles){
            right=Math.max(right,p);
        }

        while(right>=left){
            int mid=left+(right-left)/2;
            if(canEatInTime(piles,mid,h)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    public boolean canEatInTime(int[] piles,int k,int h){
        long hrs=0;
        for(int p:piles){
            int div=p/k;
            hrs+=div;
            if(p%k!=0) hrs++;
        }
        return hrs<=h;
    }
}
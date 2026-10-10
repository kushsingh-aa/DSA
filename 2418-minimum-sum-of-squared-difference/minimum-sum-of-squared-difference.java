class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int[] dif=new int[n];
        long k=k1+k2;
        long total=0;
        int maxDif=0;
        for(int i=0;i<n;i++){
            dif[i]=Math.abs(nums1[i]-nums2[i]);
            total+=dif[i];
            maxDif=Math.max(maxDif,dif[i]);
        }
        if(total<=k) return 0;

        int left=0,right=maxDif;
        while(right>left){
            int mid=left+(right-left)/2;
            long op=0;

            for(int d:dif){
                if(d>mid){
                    op+=d-mid;
                }
            }

            if(op<=k) right=mid;
            else left=mid+1;
        }
        int threshold=left;
        long rem=k;
        for(int d:dif){
            if(d>threshold){
                rem-=d-threshold;
            }
        }

        long res=0;
        for(int d:dif){
            d=Math.min(d,threshold);
            if(d==threshold && rem>0){
                d--;
                rem--;
            }
            res+=(long)d*d;
        }
        return res;
    }
}
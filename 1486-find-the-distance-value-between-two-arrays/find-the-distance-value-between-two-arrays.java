class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int cnt=0;
        int n1=arr1.length,n2=arr2.length;
        int j=0;
        for(int i=0;i<n1;i++){
            while(j<n2 && arr2[j]<arr1[i]-d) j++;
            if(j<n2 && arr2[j]<=arr1[i]+d) continue;
            cnt++;
        }
        return cnt;
    }
}
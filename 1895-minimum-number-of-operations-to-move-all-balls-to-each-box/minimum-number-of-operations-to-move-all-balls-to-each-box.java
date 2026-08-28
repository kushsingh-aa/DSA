class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] ans=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1') sum+=Math.abs(i-j);
            }
            ans[k]=sum;
            k++;
        }
        return ans;
    }
}
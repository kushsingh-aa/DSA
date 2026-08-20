class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int []a1=new int[n];
        int []a2=new int[n];
        int n1=0;
        int n2=0;
        a1[n1++]=nums[0];
        a2[n2++]=nums[1];

        for(int i=2;i<n;i++){
            if(a1[n1-1]>a2[n2-1]){
                a1[n1++]=nums[i];
            }else{
                a2[n2++]=nums[i];
            }
        }

        int[] res=new int[n];
        int j=0;
        for(int i=0;i<n1;i++){
            res[j++]=a1[i];
        }
        for(int i=0;i<n2;i++){
            res[j++]=a2[i];
        }
        return res;
    }
}
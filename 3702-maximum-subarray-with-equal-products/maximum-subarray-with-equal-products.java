class Solution {
        private int gcd(int a,int b){
            if(b==0) return a;
            return gcd(b,a%b);
        }
        private int lcm(int a,int b){
            return (a*b)/gcd(a,b);
        }
    public int maxLength(int[] nums) {
        int n=nums.length,max=0;
        for(int i=0;i<n;i++){
            int gcd=0;
            int lcm=1;
            int prod=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=lcm(lcm,nums[j]);
                if(prod==gcd*lcm){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}
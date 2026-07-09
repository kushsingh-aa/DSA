class Solution {
    private int[] digits(int num){
        int[] cnt=new int[10];
        while(num>0){
            cnt[num%10]++;
            num/=10;
        }
        return cnt;
    }
    public boolean reorderedPowerOf2(int n) {
        int cnt[]=digits(n);
        for(int i=0;i<30;i++){
            int a=1<<i;
            if(Arrays.equals(cnt,digits(a))) return true;
        }
        return false;
    }
}
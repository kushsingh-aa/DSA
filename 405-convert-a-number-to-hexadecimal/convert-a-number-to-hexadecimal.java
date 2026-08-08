class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        long n=num;
        if(n<0) n=4294967296L+n;//2^32+n
        char[] mp={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int d=(int)(n%16);
            sb.insert(0,mp[d]);
            n/=16;
        }
        return sb.toString();
    }
}
class Solution {
    public int largestInteger(int n, int s) {
        if(s>n*9 || s<0) return -1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s>=9){
                sb.append('9');
                s-=9;
            }else if(s>0){
                sb.append(s);
                s=0;
            }else{
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
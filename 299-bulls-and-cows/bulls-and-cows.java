class Solution {
    public String getHint(String secret, String guess) {
        int b=0,c=0;
        int[] cnt=new int[10];
        for(int i=0;i<secret.length();i++){
            int Sd=secret.charAt(i)-'0';
            int Gd=guess.charAt(i)-'0';
            if(Sd==Gd) b++;
            else{
                if(cnt[Sd]<0) c++;
                if(cnt[Gd]>0) c++;
            }
            cnt[Sd]++;
            cnt[Gd]--;
        }
        return b+"A"+c+"B";
    }
}
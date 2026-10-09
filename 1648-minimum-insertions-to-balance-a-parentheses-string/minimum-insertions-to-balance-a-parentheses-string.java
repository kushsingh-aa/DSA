class Solution {
    public int minInsertions(String s) {
        int ans=0;
        int open=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }else{
                if(s.length()>i+1 && s.charAt(i+1)==')'){
                    i++;
                }else{
                    ans++;
                }

                if(open>0){
                    open--;
                }else{
                    ans++;
                }
            }
        }
        ans+=open*2;
        return ans;


        // int close=0;
        // int open=0;
        // for(char c:s.toCharArray()){
        //     if(c=='('){
        //         if(close%2==1){
        //             open++;
        //             close--;
        //         }
        //         close+=2;
        //     }else{
        //         close--;
        //         if(close<0){
        //             open++;
        //             close=1;
        //         }
        //     }
        // }
        // return close+open;
    }
}
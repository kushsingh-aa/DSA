class Solution {
    public int minInsertions(String s) {
        // int ans=0;
        // Stack<Character> stack=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(c=='('){
        //         stack.push(c);
        //     }else{
        //         if(stack.isEmpty()) stack.push(c);
        //         while(!stack.isEmpty()){
        //             if(s.charAt(i+1)==')'){
        //                 i++;
        //                 stack.pop();
        //             }else{
        //                 stack.pop();
        //                 ans++;
        //             }
        //         }
        //     }
        // }
        // return ans;

        int close=0;
        int open=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(close%2==1){
                    open++;
                    close--;
                }
                close+=2;
            }else{
                close--;
                if(close<0){
                    open++;
                    close=1;
                }
            }
        }
        return close+open;
    }
}
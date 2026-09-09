class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();

        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);

        //     if(c=='(' || c=='{' || c=='[') stk.push(c);

        //     else{
        //         if(stk.isEmpty()) return false;

        //         char top=stk.peek();

        //         if((top=='(' && c==')') || (top=='{' && c=='}') || (top=='[' && c==']')){
        //             stk.pop();
        //         }

        //         else return false;
        //     }
        // }
        // return stk.isEmpty();

        for(char c:s.toCharArray()){

            if(c=='(') stk.push(')');

            else if(c=='{') stk.push('}');

            else if(c=='[') stk.push(']');

            else{
                if(stk.isEmpty() || stk.pop()!=c){
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }
}
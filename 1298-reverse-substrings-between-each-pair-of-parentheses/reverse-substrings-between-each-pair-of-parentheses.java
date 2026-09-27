class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')'){
                Queue<Character> queue=new LinkedList<>();
                while(!stack.isEmpty() && stack.peek()!='('){
                    queue.add(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
                while(!queue.isEmpty()){
                    stack.push(queue.remove());
                }
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
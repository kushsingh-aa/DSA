class Solution {
    public int minOperations(int[] nums) {
        int cnt=0;
        Stack<Integer> stack=new Stack<>();
        for(int num:nums){
            while(!stack.isEmpty() && stack.peek()>num){
                stack.pop();
                cnt++;
            }
            if(num==0 || (!stack.isEmpty() && stack.peek()==num)){
                continue;
            }
            stack.push(num);
        }
        cnt+=stack.size();
        return cnt;
    }
}
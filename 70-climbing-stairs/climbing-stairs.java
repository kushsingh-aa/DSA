class Solution {
    public int climbStairs(int n) {
        int prev=1,cur=1;
        for(int i=1;i<n;i++){
            int next=cur+prev;
            prev=cur;
            cur=next;
        }
        return cur;
    }
}
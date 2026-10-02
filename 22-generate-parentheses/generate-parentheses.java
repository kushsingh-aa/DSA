class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backTrack(res,n,0,0,"");
        return res;
    }
    void backTrack(List<String> res,int n,int open,int closed,String s){
        if(open==closed && closed==n){
            res.add(s);
            return;
        }
        if(open<n){
            backTrack(res,n,open+1,closed,s+"(");
        }
        if(open>closed){
            backTrack(res,n,open,closed+1,s+")");
        }
    }
}
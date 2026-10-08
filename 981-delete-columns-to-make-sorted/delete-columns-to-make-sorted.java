class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt=0;
        for(int i=0;i<strs[0].length();i++){
            if(unsorted(strs,i)){
                cnt++;
            }
        }
        return cnt;
    }
    boolean unsorted(String[] strs,int j){
        char c=strs[0].charAt(j);
        for(int i=1;i<strs.length;i++){
            char ch=strs[i].charAt(j);
            if(c>ch) return true;
            c=ch;
        }
        return false;
    }
}
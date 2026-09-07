class Solution {
    // Set<String> set=new HashSet<>();
    public int distinctSubseqII(String s) {
    //     solve(s,0,"");
    //     return set.size();
        int MOD=1000000007;
        int[] end=new int[26];
        int total=0;
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            int oldTotal=total;
            int newSubseq=(oldTotal+1-end[index]+MOD)%MOD;
            total=(total+newSubseq)%MOD;
            end[index]=(end[index]+newSubseq)%MOD;
        }
        return total;

    }

    // private void solve(String s,int i,String cur){
    //     if(i==s.length()){
    //         if(!cur.isEmpty()){
    //             set.add(cur);
    //         }
    //         return;
    //     }
    //     solve(s,i+1,cur+s.charAt(i));
    //     solve(s,i+1,cur);
    // }
}
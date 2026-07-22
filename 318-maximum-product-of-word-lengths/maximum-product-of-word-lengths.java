class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        boolean [][]l=new boolean[n][26];
        int mx=0;
        for(int i=0;i<n;i++){
            for(char c:words[i].toCharArray()){
                l[i][c-'a']=true;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                boolean share=false;
                for(int k=0;k<26;k++){
                    if(l[i][k] && l[j][k]){
                        share=true;
                        break;
                    }
                }
                if(!share){
                    int p=words[i].length()*words[j].length();
                    mx=Math.max(mx,p);
                }
            }
        }
        return mx; 
    }
}
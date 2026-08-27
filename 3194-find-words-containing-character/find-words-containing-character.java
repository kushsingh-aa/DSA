class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            String a=words[i];
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)==x){
                    ans.add(i);
                    break;
                }
            }
        }
            return ans;
    }
}
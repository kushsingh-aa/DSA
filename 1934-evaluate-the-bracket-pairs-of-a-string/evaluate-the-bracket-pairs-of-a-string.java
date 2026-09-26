class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n=s.length();
        Map<String,String> mp=new HashMap<>();
        for(List<String> pair:knowledge){
            mp.put(pair.get(0),pair.get(1));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                int j=s.indexOf(')',i);
                String key=s.substring(i+1,j);
                sb.append(mp.getOrDefault(key,"?"));
                i=j;
            }else{
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
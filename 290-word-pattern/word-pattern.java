class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []a=s.split(" ");
        if(pattern.length()!=a.length){
            return false;
        }
        Map<Character,String> mp=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=a[i];
            if(mp.containsKey(c)){
                if(!mp.get(c).equals(word)){
                    return false;
                }
            }else{
                if(mp.containsValue(word)){
                    return false;
                }
                mp.put(c,word);
            }
        }
        return true;

    }
}
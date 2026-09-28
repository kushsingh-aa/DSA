class Solution {
    public boolean areNumbersAscending(String s) {  
        int prev=-1;
        int i=0;
        int n=s.length();
        while(n>i){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int curNum=0;
                while(n>i && Character.isDigit(s.charAt(i))){
                    curNum=curNum*10+(s.charAt(i)-'0');
                    i++;
                }
                if(curNum<=prev){
                    return false;
                }
                prev=curNum;
            }else{
                i++;
            }
        }
        return true;
    }
}
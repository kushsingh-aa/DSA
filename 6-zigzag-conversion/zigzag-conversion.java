class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        int curRow=0;
        boolean down=false;
        for(char c:s.toCharArray()){
            sb[curRow].append(c);

            if(curRow==0 || curRow==numRows-1){
                down=!down;
            }
            curRow+=down?1:-1;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder a:sb){
            res.append(a);
        }
        return res.toString();
    }
}
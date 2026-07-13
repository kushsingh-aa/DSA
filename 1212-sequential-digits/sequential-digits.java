class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        String s="123456789";
        for(int i=1;i<10;i++){
            for(int j=0;i+j<10;j++){
                int num=Integer.parseInt(s.substring(j,j+i));
                if(num>=low && num<=high) res.add(num);
            }
        }
        return res;
    }
}
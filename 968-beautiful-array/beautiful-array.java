class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        while(l.size()<n){
            List<Integer> next=new ArrayList<>();
            for(int x:l){
                if(2*x-1<=n){
                    next.add(2*x-1);
                }
            }
            for(int x:l){
                if(2*x<=n){
                    next.add(2*x);
                }
            }
            l=next;
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=l.get(i);
        }
        return res;
    }
}
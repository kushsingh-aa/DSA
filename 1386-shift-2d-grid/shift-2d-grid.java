class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k=k%total;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }
            res.add(row);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int CurI=i*n+j;
                int newI=(CurI+k)%total;
                int newrow=newI/n;
                int newcol=newI%n;
                res.get(newrow).set(newcol,grid[i][j]);
            }
        }
        return res;
    }
}
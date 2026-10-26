class Solution {
    int m,n;
    int[][] grid;
    final int[] dir={-1,0,1,0,-1};
    public int countIslands(int[][] grid, int k) {
        this.m=grid.length;
        this.n=grid[0].length;
        this.grid=grid;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0 && dfs(i,j)%k==0) cnt++;
            }
        }
        return cnt;
    }

    public long dfs(int i,int j){
        long sum=grid[i][j];
        grid[i][j]=0;
        for(int d=0;d<4;d++){
            int x=i+dir[d];
            int y=j+dir[d+1];
            if(x>=0 && x<m && y>=0 && y<n && grid[x][y]>0){
                sum+=dfs(x,y);
            }
        }
        return sum;
    }
}
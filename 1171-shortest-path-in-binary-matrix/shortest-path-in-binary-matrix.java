class Solution {
    static int[] r={0,0,-1,1,1,-1,1,-1};
    static int[] c={-1,1,0,0,1,-1,-1,1};
    public int dfs(int[][] grid,int i,int j){
        
        if(i == grid.length-1 && j ==grid.length-1) return 1;
        if(i<0 || j<0 || i==grid.length || j==grid.length || grid[i][j] == 1){
            return (int)1e9;
        }
        
        int ans=Integer.MAX_VALUE;
        for(int k=0;k<8;k++){
            ans=Math.min(ans,1+dfs(grid,i+r[k],j+c[k]));
        }
        return ans;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(n == 1 && grid[0][0]==0) return 1;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
        boolean[][] visited=new boolean[n][n];
        Queue<int[]> q=new LinkedList<>();
        int[] r={-1,0,1,0,1,-1,1,-1};
        int[] c={0,1,0,-1,1,-1,-1,1};
        q.add(new int[]{0,0,1});
        visited[0][0]=true;
        int dist=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int i=0;i<8;i++){
                int nr=curr[0]+r[i];
                int nc=curr[1]+c[i];
                if(nr == n-1 && nc == n-1) return curr[2]+1;
                if(nr>=0 && nc>=0 && nr<n && nc<n && !visited[nr][nc] && grid[nr][nc] == 0){
                    visited[nr][nc]=true;
                    q.add(new int[]{nr,nc,curr[2]+1});
                }
            }
        } 
        return -1;
    }
}
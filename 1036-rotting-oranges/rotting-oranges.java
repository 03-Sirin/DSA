class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        //Queue<int[]> q=new LinkedList<>();
        int[][] q=new int[m*n][3];
        int front=0,rear=0;
        boolean[][] visited=new boolean[m][n];
        int time=0;
        int freshOranges=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q[rear][0]=i;
                    q[rear][1]=j;
                    q[rear][2]=time;
                    rear++;
                    visited[i][j]=true;
                }else if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }
        int[] r={1,-1,0,0};
        int[] c={0,0,-1,1};
        while(front<rear){
            int[] node=new int[3];
            node[0]=q[front][0];
            node[1]=q[front][1];
            node[2]=q[front][2];
            front++;
            for(int i=0;i<4;i++){
                int nr=node[0]+r[i];
                int nc=node[1]+c[i];
                if(nr>=0 && nc>=0 && nr<m && nc<n && !visited[nr][nc] && grid[nr][nc] == 1){
                    visited[nr][nc]=true;
                    grid[nr][nc]=2;
                    freshOranges--;
                    time=node[2]+1;
                    //q.add(new int[]{nr,nc,time});
                    q[rear][0]=nr;
                    q[rear][1]=nc;
                    q[rear][2]=time;
                    rear++;
                }
            }
        }
        if(freshOranges!=0) return -1;
        return time;
    }
}
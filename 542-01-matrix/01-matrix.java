class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int[][] ans=new int[r][c];
        boolean[][] visited=new boolean[r][c];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j] == 0){
                    ans[i][j]=0;
                    visited[i][j]=true;
                    q.add(new int[]{i,j,0});
                }
            }
        }
        int[] rd={-1,1,0,0};
        int[] cd={0,0,-1,1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int i=0;i<4;i++){
                int nr=curr[0]+rd[i];
                int nc=curr[1]+cd[i];
                int dist=curr[2];
                if(nr>=0 && nc>=0 && nr<r && nc<c && !visited[nr][nc]){
                    ans[nr][nc]=dist+1;
                    visited[nr][nc]=true;
                    q.add(new int[]{nr,nc,dist+1});
                }
            }
        }
        return ans;
    }
}
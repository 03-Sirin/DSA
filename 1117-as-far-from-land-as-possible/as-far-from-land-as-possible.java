class Solution {
    public int maxDistance(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int[][] ans=new int[r][c];  
        int maxi=Integer.MIN_VALUE;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j] == 1){
                    ans[i][j]=1;
                    q.add(new int[]{i,j,0});
                }else{
                    ans[i][j]=-1;
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
                if(nr>=0 && nc>=0 && nr<r && nc<c && ans[nr][nc] == -1){
                    ans[nr][nc]=dist+1;
                    maxi=Math.max(maxi,ans[nr][nc]);
                    q.add(new int[]{nr,nc,dist+1});
                }
            }
        }
        return maxi == Integer.MIN_VALUE ? -1 : maxi;        
    }
}
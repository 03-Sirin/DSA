class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        int i=0,n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        ans.add(newInterval);
        while(i<n){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        int[][] result=new int[ans.size()][2];
        i=0;
        for(int[] arr:ans){
            result[i][0]=arr[0];
            result[i][1]=arr[1];
            i++;
        }
        return result;
    }
}
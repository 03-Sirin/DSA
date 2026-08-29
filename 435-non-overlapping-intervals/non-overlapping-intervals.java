class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt((int[]a)->a[0]).thenComparingInt(a->a[1]));
        int last=intervals[0][1];
        int n=intervals.length;
        int count=0;
        for(int[] a:intervals){
            System.out.println(Arrays.toString(a));
        }
        for(int i=1;i<n;i++){
            if(last>intervals[i][0]){
                count++;
                last = Math.min(last, intervals[i][1]);
            }else{
                last=intervals[i][1];
            }
        }
        return count;
    }
}
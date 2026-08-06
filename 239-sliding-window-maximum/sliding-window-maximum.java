class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int j=0;
        Deque<Integer> dq=new ArrayDeque<Integer>();  
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i] ){
                dq.removeLast();
            }
            while(!dq.isEmpty() && dq.getFirst()<=i-k){
                dq.removeFirst();
            }
            dq.addLast(i);
            if(i-k+1>=0){
                ans[j++]=nums[dq.getFirst()];
            }
        }
        return ans;
    }
}
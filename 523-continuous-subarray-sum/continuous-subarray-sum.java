class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int key=sum%k;
            if(map.containsKey(key)){
                if(i-map.get(key) >= 2) return true;
            }else{
                map.put(key,i);
            }
        }
        return false;
    } 
}
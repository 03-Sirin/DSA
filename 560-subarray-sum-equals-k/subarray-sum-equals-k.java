class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0,sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            int key=sum-k;
            if(map.containsKey(key)){
                count+=map.get(key);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
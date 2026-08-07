class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0,sum=0;
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int key=sum%k;
            if(key<0) key+=k;
            if(map.containsKey(key)){
                count+=map.get(key);
            }
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return count;
    }
}
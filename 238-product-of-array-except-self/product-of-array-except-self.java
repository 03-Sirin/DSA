class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arrLeft=new int[nums.length];
        arrLeft[0]=1;
        for(int i=1;i<nums.length;i++){
           arrLeft[i]=nums[i-1]*arrLeft[i-1];  
        }

        int[] result=new int[nums.length];
        result[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            result[i]=nums[i+1]*result[i+1];
        }
        for(int i=0;i<nums.length;i++){
            result[i]*=arrLeft[i];
        }

        return result;
    }
}
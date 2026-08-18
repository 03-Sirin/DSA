class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen=new int[256];
        int start=0,maxLen=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(lastSeen[ch]>start){
                start=lastSeen[ch];
            }
            maxLen=Math.max(maxLen,i-start+1);
            lastSeen[ch]=i+1;
        }
        return maxLen;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,maxLen=0;
        int[] lastSeen=new int[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(lastSeen[ch]>start){
                start=lastSeen[ch];
            }
            lastSeen[ch]=i+1;
            maxLen=Math.max(maxLen,i-start+1);
        }
        return maxLen;
    }
}
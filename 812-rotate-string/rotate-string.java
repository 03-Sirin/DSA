class Solution {
    String rotate(String s){
        return s.substring(1)+s.charAt(0);
    }
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)) return true;
        for(int i=0;i<s.length();i++){
            String newStr=rotate(s);
            if(newStr.equals(goal)) return true;
            s=newStr;
        }
        return false;
    }
}
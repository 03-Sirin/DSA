class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0,right=s.length()-1;
        while(left<right){
            if(Character.isLetterOrDigit(s.charAt(left)) && 
               Character.isLetterOrDigit(s.charAt(right))){
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;right--;
            }
            else if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }else{
                right--;
            }
        }
        return true;
    }
}
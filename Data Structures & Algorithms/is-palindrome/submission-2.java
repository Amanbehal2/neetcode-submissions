class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        if(s.length()==1){
            return true;
        }
        while(i<j){
            char a =Character.toLowerCase(s.charAt(i));
            char b= Character.toLowerCase(s.charAt(j));
            if(!(Character.isLetterOrDigit(a))){
             i++;
             continue;
            }
            if(!(Character.isLetterOrDigit(b))){
                j--;
                continue;
            }
            if(i!=j && a!=b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

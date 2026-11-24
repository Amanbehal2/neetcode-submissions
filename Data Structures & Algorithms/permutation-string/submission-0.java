
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        int arr1[]=new int[26];
        int left=0;
        for(int right=0;right<s2.length();right++){
            arr1[s2.charAt(right)-'a']++;
            if(right-left+1==s1.length()){
             int i=0;
             while(i<26){
                if(arr[i]!=arr1[i]){
                    break;
                }
                i++;
             }
             if(i==26){
                return true;
             }
                 arr1[s2.charAt(left)-'a']--;
                    left++;
            }
            
        }
        return false;
    }
}

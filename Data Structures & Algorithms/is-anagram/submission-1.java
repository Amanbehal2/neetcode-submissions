class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            int place = s.charAt(i)-'a';
            arr[place]++;
        }
        for(int j=0;j<t.length();j++){
            int retriveral =t.charAt(j)-'a';
            arr[retriveral]--;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=0){
                return false;
            }
        }
        return true;
    }
}

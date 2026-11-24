class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=convertStringToAnagram(strs[i]);
            if(hm.containsKey(s)){
                hm.get(s).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hm.put(s, list); 
            }
        }
        
          List<List<String>> ls= new ArrayList<>();
          for (String key : hm.keySet()) {
           ls.add(hm.get(key));
           }
          return ls;
    }
    public String convertStringToAnagram(String str){
        int arr[]=new int[26];
        StringBuilder st=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            int a=ch-'a';
            arr[a]+=1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                st.append((char)(i+'a')).append(arr[i]);
            }
        }
        return st.toString();
    }
}

class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoder=new StringBuilder();
        for(String str:strs){
            encoder=encoder.append(str.length()).append("#").append(str);
        }
        return encoder.toString();
    }

    public List<String> decode(String str) {
       List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
           
            int j = i;
            while (j < str.length() && Character.isDigit(str.charAt(j))) { 
                j++; 
            }

            int length = Integer.parseInt(str.substring(i, j)); // Convert extracted digits to integer
            
            i = j + 1; 

            result.add(str.substring(i, i + length));

            i += length;
        }
        return result;
    }
}

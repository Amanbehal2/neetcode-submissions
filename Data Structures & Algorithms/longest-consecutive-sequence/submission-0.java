class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int maxlength=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=1;
            int j=1;
            while(hm.containsKey(nums[i]+j)){
                count++;
                j=j+1;
            }
            if(maxlength<count){
                maxlength=count;
            }
        }
        return maxlength;
    }
}

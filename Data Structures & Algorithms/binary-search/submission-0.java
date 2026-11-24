class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        return search(nums, si, ei, target);
    }
    public int search(int[] nums, int si, int ei, int target){
       
        if(si>ei){
            return -1;
        }
         if(si==ei){
            if(nums[si]==target){
                return si;
            }}
        int middle=(si+ei)/2;
        if(nums[middle]==target){
            return middle;
        }
        else if(nums[middle]>target){
            return search(nums,si,middle-1,target);
        }
        else{
            return search(nums,middle+1,ei,target);
        }
    }
}

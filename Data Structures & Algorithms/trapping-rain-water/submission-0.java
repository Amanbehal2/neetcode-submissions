class Solution {
    public int trap(int[] height) {
         int total=0;
        int leftArr[]=leftMax(height);
        int rightArr[]=rightMax(height);
        for(int i=0;i<height.length;i++){
            int water=Math.min(leftArr[i],rightArr[i])-height[i];
            if(water>0){
                total+=water;
            }
        }
        return total;
    }
     public int[] leftMax(int[] height){
        int leftMax=Integer.MIN_VALUE;
        int leftArr[]= new int[height.length];
        for(int i=0;i<height.length;i++){
            if(leftMax<height[i]){
                leftMax=height[i];
            }
            leftArr[i]=leftMax;
        }
        return leftArr;
    }
    public int[] rightMax(int[] height){
        int rightMax=Integer.MIN_VALUE;
        int rightArr[]=new int[height.length];
        for(int i=height.length-1;i>=0;i--){
            if(rightMax<height[i]){
                rightMax=height[i];
            }
            rightArr[i]=rightMax;
        }
        
        return rightArr;
    }
}

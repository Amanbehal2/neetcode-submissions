class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int min=1;
        int max = piles[0];
       

        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
         int answer=max;
        while(min<=max){
            int mid=min+(max-min)/2;
            int hoursNeeded = getTotalHours(piles,mid);
            if (hoursNeeded <= h) {
                answer = mid;
                max = mid - 1; 
            } else {
                min = mid + 1; 
            }
            
        }
        return answer;
    }

    public int getTotalHours(int[]piles,int h){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total=total+(piles[i]+(h-1))/h;
        }
        return total;
    }
        
    


}

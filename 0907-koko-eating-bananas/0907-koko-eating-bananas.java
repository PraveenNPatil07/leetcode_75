class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left = 1, 
        right = 1, res = Integer.MAX_VALUE;
        for (int pile : piles) right = Math.max(right, pile);
        while(left <= right){
            int mid = left + (right - left)/2;
            long time = 0;
            for(int pile : piles){
                time += Math.ceil((double)pile/mid);
                if(time > h) break;
            }
            if(time <= h){
                res = Math.min(mid, res);
                right = mid - 1;
            }
            else if(time > h){
                left = mid + 1;
            }
        }

        return res;
    }
}
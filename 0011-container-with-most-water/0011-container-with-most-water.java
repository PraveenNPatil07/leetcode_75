class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int res = Integer.MIN_VALUE;

        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         int waterFill  = Math.min(heights[i], heights[j]) * (j-i);
        //         res = Math.max(res, waterFill);
        //     }
        // }
        int i = 0, j = n - 1;
        while(i < j){
            int waterFill  = Math.min(heights[i], heights[j]) * (j-i);
            res = Math.max(res, waterFill);
            if(heights[i] < heights[j]){
                i++;
            }else j--;
        }

        return res;
    }
}
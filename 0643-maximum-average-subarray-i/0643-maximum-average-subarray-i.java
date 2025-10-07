class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int j = 0, i = 0;
        double sum = 0, res = 0;
        for(; i<k; i++){
            res += nums[i];
        }
        sum = res;
        res /= k;
        while(i<n){
            sum += nums[i];
            sum -= nums[j];
            j++;i++;
            res = Math.max(res, sum/k);
        }

        return res;
    }
}
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length, res = Integer.MIN_VALUE;
        int left = 0, right = 0, zeros = 0;

        while(right < n){
            if(nums[right] == 0) zeros++;
            while(zeros > 1){
                if(nums[left] == 0) zeros--;
                left++;
            }
            res = Math.max(res,right-left);
            right++;
        }

        return res ;
    }
}
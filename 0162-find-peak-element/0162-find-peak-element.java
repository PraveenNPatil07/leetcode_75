class Solution {
    public int findPeakElement(int[] nums) {
        int res = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(max <= nums[i]){
                res = i;
                max = nums[i];
            }
        }

        return res;
    }
}
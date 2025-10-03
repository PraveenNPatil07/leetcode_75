class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, zeroCount = 0;
        int[] res = new int[n];
        int mul = 1;

        for(int num : nums){
            if(num == 0){
                zeroCount++;
                continue;
            }
            if(zeroCount >= 2) return res;
            mul *= num;
        }
        if(zeroCount >= 2) return res;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                res[i] = mul;
                continue;
            }
            if(zeroCount >= 1) continue;
            res[i] = (mul/nums[i]);
        }

        return res;
    }
}
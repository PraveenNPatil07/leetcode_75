class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length, res=0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.getOrDefault(k-nums[i],0) > 0){
                res++;
                map.put(k-nums[i], map.get(k-nums[i])-1);
                continue;
            }
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        return res;
    }
}
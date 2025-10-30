class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int n : nums) queue.add(n);
        for(int i=0; i<nums.length - k; i++) queue.poll();
        return queue.poll();
    }
}
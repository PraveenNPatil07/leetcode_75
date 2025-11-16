class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        Stack<int[]> stack = new Stack<>();
        for(int i=0; i<n; i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] cur = stack.pop();
                res[cur[1]] = i - cur[1];
            }
            stack.push(new int[] {t,i});
        }

        return res;
    }
}
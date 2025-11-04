class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(k,n,list,1,0,ans);
        return ans;
    }
    private void backtrack(int k, int n, List<Integer> list, int start, int sum, List<List<Integer>> ans) {
    if (list.size() == k && sum == n) {
        ans.add(new ArrayList<>(list));
        return;
    }
    if (list.size() > k || sum > n) return;
    
    for (int i = start; i <= 9; i++) {
        if (sum + i <= n) {
            list.add(i);
            backtrack(k, n, list, i + 1, sum + i, ans);
            list.remove(list.size() - 1);
        } else {
            break;
        }
    }
}
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        int n = candies.length;
        for(int i=1;i<n;i++){
            max=Math.max(max,candies[i]);
        }
        List<Boolean> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            res.add((candies[i]+extraCandies) >= max);
        }

        return res;
    }
}
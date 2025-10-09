class Solution {
    public int largestAltitude(int[] gain) {
        int res = Integer.MIN_VALUE, at = 0;
        for(int g : gain){
            at += g;
            res = Math.max(res, at);
        }
        return res<0?0:res;
    }
}
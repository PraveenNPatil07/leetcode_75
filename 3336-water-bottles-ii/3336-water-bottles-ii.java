class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles, empty = numBottles;
        while(empty >= numExchange){
            res++;
            empty -= numExchange;
            empty++;
            numExchange++;
        }
        return res;
    }
}
class Solution {
    public List<List<Integer>> findDifference(int[] a, int[] b) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> x = new HashSet<>();
        for(int i:a) x.add(i);
         HashSet<Integer> y = new HashSet<>();
        for(int j:b) y.add(j);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int num : x) {
            if (!y.contains(num)) c.add(num);
        }

        for (int num : y) {
            if (!x.contains(num)) d.add(num);
        }


        res.add(c);
        res.add(d);


    return res;}
}
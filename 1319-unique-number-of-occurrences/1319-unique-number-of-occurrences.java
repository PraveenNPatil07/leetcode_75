class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            set.add(e.getValue());
        }

        return map.size() == set.size();
    }
}
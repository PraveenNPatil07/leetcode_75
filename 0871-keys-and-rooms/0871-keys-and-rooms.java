class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];

        stack.push(0);
        visited[0] = true;

        while(!stack.isEmpty()){
            int cur = stack.pop();
            for(int a : rooms.get(cur)){
                if(!visited[a]){
                    visited[a] = true;
                    stack.push(a);
                }
            }
        }

        for(boolean v : visited) if(v == false) return false;
        return true;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int freshCount = 0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1) freshCount++;
                if(grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }
        if(freshCount == 0) return 0;
        int time = 0;
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
            int[] cur = queue.poll();
            int r = cur[0], c = cur[1];
            int[][] next = {{r-1,c}, {r+1,c}, {r,c+1}, {r,c-1}};

            for(int[] ne : next){
                if(ne[0] == -1 || ne[0] == n || ne[1] == -1 || ne[1] == m || visited[ne[0]][ne[1]] 
                ||grid[ne[0]][ne[1]] != 1) continue;
                freshCount--;
                visited[ne[0]][ne[1]] = true;
                queue.add(ne);
            }
            }
            time++;
            if(freshCount == 0) return time;
        }

        return -1;
    }
}
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        int res  = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                boolean equal = true;
                for(int k=0; k<n; k++){
                    if(grid[i][k] != grid[k][j]){
                        equal = false;
                        break;
                    }
                }
                if(equal) res++;
            }
        }

        return res;
    }
}
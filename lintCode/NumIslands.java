package scu.wsn.lx;

public class NumIslands {
	public int numIslands(boolean[][] grid) {
        // Write your code here
		if(grid == null) return 0;
		int sum =0;
		for(int j=0;j<grid.length;j++){
			for(int i=0;i<grid[j].length;i++){
				if(grid[i][j]){
					sum++;
					dfs(grid,i,j);
				}
			}
		}
		return sum;
    }
	
	private void dfs(boolean grid[][],int i,int j){
		if(i<grid.length&&j<grid[i].length &&grid[i][j]==true){
			grid[i][j] = false;
			dfs(grid,i,j+1);
			dfs(grid,i,j-1);
			dfs(grid,i-1,j);
			dfs(grid,i+1,j);
		}
	}
}

package scu.wsn.lx;

import org.junit.Test;

public class MinPathSum {
	 public int minPathSum(int[][] grid) {
	        int sum = 0;
	        if(grid == null) return 0;
	        else if(grid.length == 1){
	            for(int j=0;j<grid.length;j++)
	                sum+= grid[j][0];
	            return sum;
	        }
	       sum = grid[0][0];
	       int row =0,col=0;
	        for(int j = 0;j<grid.length+grid[0].length-2;j++){
	            if(grid[row+1][col]+sum>grid[row][col+1])
	                sum += grid[row][++col];
	            else
	                sum += grid[++row][col];
	            j++;
	        }
	        return sum+grid[grid.length-1][grid[0].length];
	    }
	 
	 @Test
	 public void Test(){
		 int arr[][]={{1,2},{1,1}};
		System.out.println(minPathSum(arr));
	 }
}

class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum =0 , temp =0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[i].length ; j++)
            {

                if(grid[i][j]==1)
                {
                    temp =4;
                    if(i>0 && grid[i-1][j]==1)
                    temp--;
                    if(i+1<grid.length && grid[i+1][j]==1)
                    temp--;
                    if(j>0 && grid[i][j-1]==1)
                    temp--;
                    if(j+1<grid[i].length && grid[i][j+1]==1)
                    temp--;
                    sum+=temp;
                }

            }
        }
        return sum;
    }
}
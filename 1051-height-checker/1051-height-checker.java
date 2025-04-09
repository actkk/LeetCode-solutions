import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int x=0;
        for(int i = 0 ; i<heights.length ;  i++){
            if(sorted[i]!=heights[i])
            x++;

        }
        return x;
    }
}
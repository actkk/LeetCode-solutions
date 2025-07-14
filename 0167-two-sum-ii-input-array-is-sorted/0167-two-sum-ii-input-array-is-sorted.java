class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] returnarr = new int[2];
        for(int i = 0 ; i<numbers.length ; i++ ){
            int remaning = target - numbers[i];
            for (int j = i+1 ; j<numbers.length ; j++){
                if(numbers[j]>remaning)
                break;
                if(numbers[j]==remaning){
                    returnarr[0]=i+1;
                    returnarr[1]=j+1;
                    return returnarr;
                }




            }


        }
        return returnarr;
    }
}
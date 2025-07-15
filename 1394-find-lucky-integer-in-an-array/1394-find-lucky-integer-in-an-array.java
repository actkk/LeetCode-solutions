class Solution {
    public int findLucky(int[] arr) {
    Arrays.sort(arr);
    int temp = arr[arr.length-1];
    int count = 1;
    for(int i = arr.length -2; i >=0 ;i--){

        if(arr[i]==temp){

            if(++count == temp && (i==0 || (i>0 && arr[i-1]!=temp)))
                return temp;}
        if(arr[i]!=temp){
            temp = arr[i];
            count =1;
            if(i==0 && temp == 1 )
                return 1;
            }

    }
    return -1;
    }
}
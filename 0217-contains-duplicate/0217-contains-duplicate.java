import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);


        int num = nums[0];

        for(int i= 1;i < nums.length ; i++)
        {
            if(num==nums[i])
                return true;
            num = nums[i];

        }
        return false;
        
    }
}
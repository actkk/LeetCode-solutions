class Solution {
    public int singleNumber(int[] nums) {
    List <Integer> x = new ArrayList<>();
    for(int i =0 ; i<nums.length; i++)
    {
        if (x.contains(nums[i])) 
            x.remove(Integer.valueOf(nums[i]));
        else 
        x.add(nums[i]);


    }
    return x.get(0);
        
    }
}
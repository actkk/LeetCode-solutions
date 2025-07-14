class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        if (nums[nums.length / 2] == target)
            return nums.length / 2;
        else if (nums.length <= 1)
            return nums[0] < target ? 1 : 0;
        else if (nums[nums.length / 2] < target) {
            int[] newnums = new int[nums.length - nums.length / 2 - 1];
            for (int i = 0; i < newnums.length; i++) {
                newnums[i] = nums[i + nums.length / 2 + 1];
            }
            return nums.length / 2 + 1 + searchInsert(newnums, target);
        } else {
            int[] newnums = new int[nums.length / 2];
            for (int i = 0; i < newnums.length; i++) {
                newnums[i] = nums[i];
            }
            return searchInsert(newnums, target);
        }
    }
}

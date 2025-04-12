class Solution(object):
    def uniqueXorTriplets(self, nums):
        n = len(nums)
        if n < 3:
            return n  # 1 -> 1, 2 -> 2
        # For n >= 3:
        return 1 << (n.bit_length()) 
        
class Solution(object):
    def uniqueXorTriplets(self, nums):
        from collections import Counter
        freq = Counter(nums)
        distinct_vals = list(freq.keys())

        B = set()
        C = set(distinct_vals)

        for x in distinct_vals:
            if freq[x] >= 2:
                B.add(0)
            for y in distinct_vals:
                if x != y:
                    B.add(x ^ y)

        for b in B:
            for z in distinct_vals:
                C.add(b ^ z)

        return len(C)

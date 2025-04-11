class Solution(object):
    def strongPasswordChecker(self, password):
        n = len(password)

        has_lower = any(c.islower() for c in password)
        has_upper = any(c.isupper() for c in password)
        has_digit = any(c.isdigit() for c in password)
        missing_types = (not has_lower) + (not has_upper) + (not has_digit)

        replacements = 0
        one_excess, two_excess = 0, 0
        i = 0

        while i < n:
            length = 1
            while i + length < n and password[i + length] == password[i]:
                length += 1

            if length >= 3:
                replacements += length // 3
                if length % 3 == 0:
                    one_excess += 1
                elif length % 3 == 1:
                    two_excess += 1

            i += length

        if n < 6:
            # Case 1: 
            return max(missing_types, 6 - n)
        elif n <= 20:
            # Case 2: 
            return max(missing_types, replacements)
        else:
            # Case 3: 
            removals = n - 20

            # Optimize replacements 
            used_removals = min(removals, one_excess)
            replacements -= used_removals
            removals -= used_removals

            used_removals = min(removals, two_excess * 2) // 2
            replacements -= used_removals
            removals -= used_removals * 2

            replacements -= removals // 3

            return (n - 20) + max(missing_types, replacements)

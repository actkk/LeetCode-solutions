class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean isPowerOfTwo = n > 0 && (n & -n) == n;
    return isPowerOfTwo;
    }
}
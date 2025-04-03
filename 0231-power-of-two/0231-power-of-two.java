class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean isPowerOfTwo = n > 0 && (n & (n - 1)) == 0;
    return isPowerOfTwo;
    }
}
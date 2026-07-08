// Last updated: 7/8/2026, 3:42:38 PM
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        long left = 1, right = x;
        long ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = mid;      // store valid floor sqrt
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) ans;
    }
}
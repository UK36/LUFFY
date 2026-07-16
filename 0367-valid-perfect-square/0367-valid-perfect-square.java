class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;   // 0 and 1 are perfect squares

        int s = 2, e = num / 2;

        while (s <= e) {
            long mid = s + (e - s) / 2;   // use long to avoid overflow in mid*mid
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                s = (int) mid + 1;
            } else {
                e = (int) mid - 1;
            }
        }
        return false;
    }
}
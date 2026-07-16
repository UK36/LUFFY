class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;   

        int s = 2, e = num / 2;

        while (s <= e) {
            long mid = s + (e - s) / 2;   
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
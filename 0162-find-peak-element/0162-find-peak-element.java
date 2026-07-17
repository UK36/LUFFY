class Solution {
    public int findPeakElement(int[] arr) {
         int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                // still ascending, peak is to the right
                s = mid + 1;
            } else {
                // descending (or at boundary), peak could be here
                ans = mid;
                e = mid - 1;   // <-- this was missing
            }
        }
        return ans;
    }
}
    

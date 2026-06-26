class Solution {
    public int missingNumber(int[] nums) {
        int xorSum = 0;
        //xor with all the array elements
        for(int n: nums) {
            xorSum = xorSum ^ n;
        }
        //xor wirh all the element in the range
        int n =nums.length;
        for(int i=0; i<=n; i++){
            xorSum = xorSum ^ i;
        }
        //ans ajaega
        return xorSum;
    }
}
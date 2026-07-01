class Solution {
    public int maxSubArray(int[] nums) {
        int Sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            // step1; sum create 
            Sum = Sum + nums[i];
            // step2:maxi update
            maxi = Math.max(maxi,Sum);

            //step3:sum check -ve Value
            if(Sum < 0)
            Sum =0;


        }

        return maxi;
    }
}
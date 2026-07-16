class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

         int s = 1, e = x/2;
         int ans = 1;

          while(s <= e ){
         int  mid = s +(e-s)/2;
         

          if(mid <= x/mid){
            ans = mid;
          s = mid+1;
          }  else{
            e = mid-1;
        }
          }
          return ans;
    }
    
}
class Solution {
    public int lengthOfLastWord(String s) {
        
        int n = s.length() - 1;

        while(n >=0 && s.charAt(n) == ' '){
            n--;
        }
        int m = n;
        while(m >= 0 && s.charAt(m) != ' '){
            m--;
        }
          return n-m;
    }
}
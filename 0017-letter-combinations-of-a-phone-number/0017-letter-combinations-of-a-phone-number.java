import java.util.*;

class Solution {
    private static final String[] PHONE = {
        "",     "",     "abc",  "def",   // 0, 1, 2, 3
        "ghi",  "jkl",  "mno",  "pqrs",  // 4, 5, 6, 7
        "tuv",  "wxyz"                    // 8, 9
    };

    private List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return result;
        backtrack(digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current) {
        // Base case: one letter chosen per digit → valid combination
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = PHONE[digits.charAt(index) - '0'];

        for (char letter : letters.toCharArray()) {
            current.append(letter);              // Choose
            backtrack(digits, index + 1, current); // Explore
            current.deleteCharAt(current.length() - 1); // Un-choose (backtrack)
        }
    }
}
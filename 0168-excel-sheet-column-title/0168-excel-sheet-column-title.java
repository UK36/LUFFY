class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;                     // shift 1-indexed to 0-indexed
            int rem = columnNumber % 26;        // 0-25 -> A-Z
            char c = (char) ('A' + rem);
            sb.append(c);
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}
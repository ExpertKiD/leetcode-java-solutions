package np.com.suman_adhikari.solutions;

public class Problem_000215_Solution {

    /**
     * 125. Valid Palindrome
     *
     * <a href="https://leetcode.com/problems/valid-palindrome">125. Valid Palindrome</a>
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        StringBuilder sb = new StringBuilder();


        for (int c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            }
        }

        String reverseStr = sb.reverse().toString().toLowerCase();
        String str = sb.toString().toLowerCase();


        return str.equals(reverseStr);
    }

    /**
     * 125. Valid Palindrome
     * <p>
     * Using Two pointer system
     *
     * <a href="https://leetcode.com/problems/valid-palindrome">125. Valid Palindrome</a>
     *
     * @param s
     * @return
     */
    public boolean isPalindromeTwoPointer(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        char[] chars = s.toCharArray();

        int start = 0, end = chars.length - 1;

        while (start < end) {

            if (!Character.isLetterOrDigit(chars[start])) {
                start++;
            } else if (!Character.isLetterOrDigit(chars[end])) {
                end--;
            } else if (Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[end])) {
                return false;
            } else {

                start++;
                end--;
            }


        }

        return true;
    }
}

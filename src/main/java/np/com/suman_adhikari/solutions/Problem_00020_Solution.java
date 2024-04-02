package np.com.suman_adhikari.solutions;

import java.util.LinkedList;

public class Problem_00020_Solution {
    public static void main(String[] args) {

    }

    /**
     * 20. Valid Parentheses - Using LinkedList as Stack
     *
     * <a href="https://leetcode.com/problems/valid-parentheses">20. Valid Parentheses</a>
     *
     * @param s
     * @return boolean
     */
    public static boolean isValid(String s) {

        if (s == null || s.isEmpty())
            return true;

        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                list.addFirst(c);
            } else if (c == ')' && (list.isEmpty() || list.poll() != '(')) {
                return false;
            } else if (c == '}' && (list.isEmpty() || list.poll() != '{')) {
                return false;
            } else if (c == ']' && (list.isEmpty() || list.poll() != '[')) {
                return false;
            }


        }

        return list.isEmpty();
    }

    /**
     * 20. Valid Parentheses - Using array as stack
     *
     * <a href="https://leetcode.com/problems/valid-parentheses">20. Valid Parentheses</a>
     *
     * @param s
     * @return boolean
     */
    public static boolean isValidWithArray(String s) {

        if (s == null || s.isEmpty())
            return true;

        LinkedList<Character> list = new LinkedList<>();

        char[] chArray = new char[s.length()];
        int index = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                chArray[++index] = c;
            } else if (c == ')') {
                if (index == -1 || chArray[index] != '(') {
                    return false;
                }

                index--;
            } else if (c == '}') {
                if (index == -1 || chArray[index] != '{') {
                    return false;
                }

                index--;


            } else if (c == ']') {
                if (index == -1 || chArray[index] != '[') {
                    return false;
                }

                index--;
            }


        }

        return index == -1;
    }
}

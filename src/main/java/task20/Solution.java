package task20;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
public class Solution {
    public static final char BRACKET_ROUND_OPEN = '(';
    public static final char BRACKET_ROUND_CLOSE = ')';
    public static final char BRACKET_SQUARE_OPEN = '[';
    public static final char BRACKET_SQUARE_CLOSE = ']';
    public static final char BRACKET_BRACE_OPEN = '{';
    public static final char BRACKET_BRACE_CLOSE = '}';

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            switch (current) {
                case BRACKET_ROUND_OPEN:
                case BRACKET_SQUARE_OPEN:
                case BRACKET_BRACE_OPEN:
                    stack.push(current);
                    break;
                case BRACKET_ROUND_CLOSE:
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.peek() == BRACKET_ROUND_OPEN) {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    break;
                case BRACKET_SQUARE_CLOSE:
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.peek() == BRACKET_SQUARE_OPEN) {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    break;
                case BRACKET_BRACE_CLOSE:
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.peek() == BRACKET_BRACE_OPEN) {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }
}

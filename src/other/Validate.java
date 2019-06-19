package other;

import java.util.Stack;

public class Validate {

    public static boolean validMethod(String s) {

        {
            if (s.isEmpty())
                return true;
            if (s.length()==1)
                return false;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                }
                if (c == '}' || c == ')' || c == ']') {
                    if (stack.isEmpty())
                        return false;
                    char last = stack.peek();
                    if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
                        stack.pop();
                    else
                        return false;
                }
            }
            return stack.isEmpty();
        }
    }
}

import java.util.HashMap;
import java.util.Stack;

public class Validate {

    public static boolean validMethod(String s){

        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {

                            char topChar;
                            if( stack.empty()) {
                                topChar = 'q';
                            } else topChar = stack.pop();

                        if (topChar != map.get(c)) {
                            return false;
                            }
            } else {

                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}

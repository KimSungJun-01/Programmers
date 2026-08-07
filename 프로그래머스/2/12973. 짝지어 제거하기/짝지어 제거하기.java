import java.util.ArrayDeque;
import java.util.Stack;

public class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<Character>();

        if(s.length() == 1) {
            return 0;
        }

        stack.add(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty() && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}

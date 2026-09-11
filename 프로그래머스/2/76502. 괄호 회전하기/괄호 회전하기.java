import java.util.LinkedList;
import java.util.Stack;

public class Solution {

    public int solution(String s) {
        int answer = 0;

        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        Stack<Character> stack = new Stack<>();
        int x = 0;
        do {
            for(int i = 0; i < list.size(); i++) {
                if(!stack.isEmpty() && (stack.peek() == '(' && list.get(i) == ')' || stack.peek() == '{' && list.get(i) == '}' || stack.peek() == '[' && list.get(i) == ']')) {
                    stack.pop();
                } else {
                    stack.push(list.get(i));
                }
            }
            if(stack.isEmpty()) {
                answer++;
            }
            stack.clear();
            x++;
            char first = list.removeFirst();
            list.addLast(first);
        } while(x < list.size());

        return answer;
    }
}

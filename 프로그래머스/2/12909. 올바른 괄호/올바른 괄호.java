import java.util.Stack;

public class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        Stack st = new Stack();

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    st.pop();
                }
            }
        }

        if (!st.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}

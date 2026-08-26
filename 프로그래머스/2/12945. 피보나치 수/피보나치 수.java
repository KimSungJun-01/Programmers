import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        Integer answer = 0;

        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);

        for(int i = 2; i <= n; i++) {
            fib.add((fib.get(i-1) + fib.get(i-2)) % 1234567);
        }

        answer = fib.get(n);

        return answer;
    }
}
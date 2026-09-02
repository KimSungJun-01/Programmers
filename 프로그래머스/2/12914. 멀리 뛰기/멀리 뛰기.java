public class Solution {

    public long solution(int n) {
        long answer = 0;

        long fibonacci[] = new long[n + 2];
        fibonacci[1] = 1;
        fibonacci[2] = 2;

        for (int i = 3; i <= n; i++) {
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % 1234567;
        }

        answer = fibonacci[n];

        return answer;
    }
}

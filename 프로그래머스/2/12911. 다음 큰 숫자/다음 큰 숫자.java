

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int count1 = 0;
        String number1 = Integer.toBinaryString(n++);
        for(int i = 0; i < number1.length(); i++) {
            if(number1.charAt(i) == '1') {
                count1++;
            }
        }

        while(true) {
            int count2 = 0;
            String number2 = Integer.toBinaryString(n);
            for(int i = 0; i < number2.length(); i++) {
                if(number2.charAt(i) == '1') {
                    count2++;
                }
            }

            if(count1 == count2) {
                answer = n;
                break;
            }

            n++;
        }

        return answer;
    }
}

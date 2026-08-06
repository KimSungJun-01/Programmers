public class Solution {
    public int solution(int n) {
        int answer = 0;


        int count = 1;
        for(int i = 1; i < n; i++) {
            int j = i;
            int number = n;
            while(true) {
                number -= j++;
                if(number == j) {
                    count++;
                    break;
                } else if(number > j) {
                    continue;
                } else {
                    break;
                }
            }
        }

        answer = count;
        return answer;
    }
}

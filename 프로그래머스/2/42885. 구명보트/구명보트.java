import java.util.*;

public class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        while(i <= j) {
            if(i == j) {
                answer++;
                break;
            }
            int sum = people[i] + people[j];
            if(sum <= limit) {
                i++;
            }
            j--;
            answer++;
        }
        return answer;
    }
}

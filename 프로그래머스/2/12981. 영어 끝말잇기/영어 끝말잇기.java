import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] solution(int n, String words[]) {
        int answer[] = {};

        boolean finish = false;
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        String beforeWord = words[0];
        for(int i = 1; i < words.length; i++) {
            if(set.contains(words[i]) || (beforeWord.charAt(beforeWord.length() - 1) != words[i].charAt(0))) {
                answer = new int[]{(i % n) + 1, (i / n + 1)};
                finish = true;
                break;
            }
            set.add(words[i]);
            beforeWord = words[i];
        }

        if(!finish) {
            return new int[]{0, 0};
        }

        return answer;
    }
}

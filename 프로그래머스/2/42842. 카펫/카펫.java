public class Solution {
    public int[] solution(int brown, int yellow) {
        int answer[] = {};

        int extent = brown + yellow;
        for(int i = 3; i <= extent; i++) {
            if(extent % i != 0) {
                continue;
            }
            int h = i;
            int w = extent / h;
            if(2 * (w + h) - 4 == brown) {
                answer = new int[]{w, h};
                break;
            }
        }

        return answer;
    }
}

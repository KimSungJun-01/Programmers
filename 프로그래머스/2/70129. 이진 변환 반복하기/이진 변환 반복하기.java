public class Solution {
    public int[] solution(String s) {
        int[] answer = {};

        int round = 0;
        int count = 0;
        while(!s.equals("1")) {
            round++;
            int length = s.length();
            s = s.replaceAll("0", "");
            count += length - s.length();
            s = Integer.toBinaryString(s.length());
        }

        answer = new int[]{round, count};
        return answer;
    }
}

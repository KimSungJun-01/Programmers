class Solution {
    public String solution(String s) {
        StringBuilder answer  = new StringBuilder();

        // 첫 단어의 글자인지 여부
        boolean isFirstChar = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer.append(s.charAt(i));
                isFirstChar = true;
            } else {
                if (isFirstChar) {
                    answer.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    answer.append(Character.toLowerCase(s.charAt(i)));
                }
                isFirstChar = false;
            }
        }

        return answer.toString();
    }
}

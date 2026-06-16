class Solution {
    public String solution(String s) {
        String answer = "";

        // 공백 기준으로 배열에 넣기
        String list[] = s.split(" ");

        // 배열의 첫 번째 값을 최소값, 최대값으로 설정
        int min = Integer.parseInt(list[0]);
        int max = Integer.parseInt(list[0]);

        for(int i = 1; i < list.length; i++) {
            if (Integer.parseInt(list[i]) < min) {
                min = Integer.parseInt(list[i]);
            }
            if (Integer.parseInt(list[i]) > max) {
                max = Integer.parseInt(list[i]);
            }
        }

        answer = min + " " + max;
        return answer;
    }
}
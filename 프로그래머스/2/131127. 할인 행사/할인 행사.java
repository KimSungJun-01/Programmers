import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(String want[], int number[], String discount[]) {
        int answer = 0;

        Map<String, Integer> wish = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wish.put(want[i], number[i]);
        }

        Map<String, Integer> sale = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            sale.put(discount[i], sale.getOrDefault(discount[i], 0) + 1);
        }

        if(wish.entrySet().containsAll(sale.entrySet())) {
            answer++;
        }
        for (int i = 10; i < discount.length; i++) {
            sale.put(discount[i], sale.getOrDefault(discount[i], 0) + 1);
            sale.put(discount[i - 10], sale.get(discount[i - 10]) - 1);
            if(sale.get(discount[i - 10]) == 0) {
                sale.remove(discount[i - 10]);
            }
            if(wish.entrySet().containsAll(sale.entrySet())) {
                answer++;
            }
        }

        return answer;
    }
}

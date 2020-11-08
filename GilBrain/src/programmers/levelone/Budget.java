package programmers.levelone;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12982
final class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int index = 0;
        boolean isBiggerThanZero = false;
        while (budget > 0) {
            int minusBudget = budget - d[index];
            isBiggerThanZero = (minusBudget) >= 0;
            if (!isBiggerThanZero)
                break;
            budget = minusBudget;
            index++;
            answer++;
            if (index == d.length)
                break;

        }

        return answer;
    }
}

public class Budget {

}

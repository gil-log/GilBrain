package programmers.leveltwo;

import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/42587
final class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        int prioritiesLength = priorities.length;

        int[] documentsDesc = new int[prioritiesLength];

        for (int i = 0; i < prioritiesLength; i++) {
            documentsDesc[i] = priorities[i];
        }

        Arrays.sort(documentsDesc);

        int index = 0;
        int rankIndex = prioritiesLength - 1;
        while (true) {
            if (priorities[index] == documentsDesc[rankIndex]) {
                priorities[index] = 0;
                answer++;

                if (index == location)
                    break;

                rankIndex--;
                index++;

            } else if (priorities[index] != documentsDesc[rankIndex]) {
                index++;
            }
            if (index == prioritiesLength)
                index = 0;
            if (rankIndex == -1)
                break;
        }

        return answer;
    }
}

public class Printer {

}

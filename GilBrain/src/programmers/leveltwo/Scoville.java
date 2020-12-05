package programmers.leveltwo;

import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42626
final class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue queue = new PriorityQueue();

        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        while (isAnyLowerScoville(queue, K)) {

            if (queue.size() == 1)
                return -1;

            int firstScovile = (int) queue.remove();
            int secondScovile = (int) queue.remove();

            int mixedScoville = mixScoville(firstScovile, secondScovile);
            answer++;
            queue.add(mixedScoville);
        }

        return answer;
    }

    public int mixScoville(int first, int second) {

        int mixedScoville = first + second * 2;

        return mixedScoville;

    }

    public boolean isAnyLowerScoville(PriorityQueue queue, int K) {

        int lowestScovile = (int) queue.peek();

        if (lowestScovile >= K)
            return false;

        return true;

    }
}

public class Scoville {

}
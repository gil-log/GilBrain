import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/42586
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int progressesLength = progresses.length;

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> answerQueue = new LinkedList<>();

        for (int i = 0; i < progressesLength; i++) {
            int RemainingWork = 100 - progresses[i];
            int endDay = (int) Math.ceil((double) RemainingWork / (double) speeds[i]);
            queue.add(endDay);
        }

        for (int i = 0; i < progressesLength; i++) {
            boolean flag = true;
            int pollEndDay = 0;
            if (!queue.isEmpty()) {
                pollEndDay = queue.poll();
            } else if (queue.isEmpty()) {
                break;
            }

            int functionCount = 1;
            while (flag) {
                int nextPeekEndDay = 0;
                if (!queue.isEmpty()) {
                    nextPeekEndDay = queue.peek();
                } else if (queue.isEmpty()) {
                    break;
                }

                if (pollEndDay >= nextPeekEndDay) {
                    functionCount++;
                    if (!queue.isEmpty()) {
                        queue.remove();
                    } else if (queue.isEmpty()) {
                        break;
                    }
                } else if (pollEndDay < nextPeekEndDay) {
                    flag = false;
                }
            }
            answerQueue.add(functionCount);
        }

        int[] answer = new int[answerQueue.size()];
        int index = 0;
        while (!answerQueue.isEmpty()) {
            answer[index] = answerQueue.poll();
            index++;
        }

        return answer;
    }
}

public class FunctionDevelope {
}

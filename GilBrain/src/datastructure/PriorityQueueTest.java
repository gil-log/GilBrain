package datastructure;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        // 낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        // 높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueueLowest.add(1);
        priorityQueueLowest.add(10);
        priorityQueueLowest.offer(100);

        priorityQueueHighest.add(2);
        priorityQueueHighest.add(3);
        priorityQueueHighest.offer(4);

        for (int lowest : priorityQueueLowest) {
            System.out.println("오름차순 우선순위 큐 : " + lowest);
        }

        for (int highest : priorityQueueHighest) {
            System.out.println("내림차순 우선순위 큐 : " + highest);
        }
    }
}

class Gillog implements Comparable<Gillog> {

    private int writeRowNumber;
    private String content;

    public Gillog(int writeRowNumber, String content) {
        this.writeRowNumber = writeRowNumber;
        this.content = content;
    }

    public int getWriteRowNumber() {
        return this.writeRowNumber;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public int compareTo(Gillog gillog) {

        if (this.writeRowNumber > gillog.getWriteRowNumber())
            return 1;
        else if (this.writeRowNumber < gillog.getWriteRowNumber())
            return -1;
        return 0;
    }
}

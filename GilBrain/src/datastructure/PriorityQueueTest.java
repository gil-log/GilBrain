package datastructure;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

    }
}

class Gillog implements Comparable<Gillog> {

    private int writeRowNumber;
    private String content;

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

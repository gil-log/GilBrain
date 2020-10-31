package algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BfsArray {
    static int Ne; // 간선 개수
    static int Nv; // 정점(노드) 개수
    static int[][] ad; // 인접 배열
    static boolean[] visit; // 정점(노드) 방문 여부 확인 용도

    public static void bfs(int i) {
        Queue<Integer> q = new <Integer>LinkedList();
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>(); // hash Map을 이용하여 queue data 중복 방지

        // add는 큐가 꽉차면 예외 발생, 
        //offer는 추가에 실패를 의미하는 false return
        q.offer(i);

        while (!q.isEmpty()) {
            // 방문할 노드를 큐에서 값 빼기, 
            // remove는 큐에 데이터가 없으면 예외발생, 
            // poll은 데이터가 없으면 실패를 의미하는 false return
            int temp = q.poll();
            // 해당 노드를 방문으로 처리
            visit[temp] = true;
            // 방문 노드 출력
            System.out.print(temp);

            // 노드는 1부터 존재하므로 1부터 시작
            // 이중 배열 생성 당시 크기를 Nv+1 해주어서 문제 없음
            for (int j = 1; j <= Nv; j++) {
                // 방문 노드에 연결된 노드이고 방문하지않은 노드 일 경우
                if (ad[temp][j] == 1 && visit[j] == false) {
                    // 중복 데이터가 hash에 없을경우
                    if (!hash.containsKey(j)) {
                        // q에 노드j 삽입
                        q.offer(j);
                        // hash에 j 방문 정보 입력
                        hash.put(j, true);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Ne = 8;
        Nv = 6;

        // 노드는 1부터 시작이라 노드 개수 + 1
        ad = new int[Nv + 1][Nv + 1];
        visit = new boolean[Nv + 1];

        int[][] arr = {{0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1, 0, 1},
            {0, 0, 1, 0, 1, 1, 0},
            {0, 0, 1, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 0}}; 

        ad = arr;

        bfs(1);
    }
}

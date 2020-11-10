import java.util.Arrays;
import java.util.Queue;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

//https://programmers.co.kr/learn/courses/30/lessons/42889
final class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        // 0제외, N스테이지깨면 N+1에 저장하려고 N+2 크기를 줌
        int[] clearPeopleNum = new int[N + 2];

        int peopleNum = stages.length;

        Arrays.sort(stages);

        for (int i = 0; i < peopleNum; i++) {
            int peopleAtStage = stages[i];
            clearPeopleNum[peopleAtStage]++;
        }
        /*
         * for(int a : clearPeopleNum){ System.out.println(a); }
         */

        // 스테이지 도달 플레이어 수
        // 실패율 위해서 float으로
        float stageAtPeople = (float) peopleNum;

        Queue<Integer> zeroFailStage = new LinkedList<>();

        Map<Integer, Float> stageFailMap = new TreeMap<>();

        for (int i = 1; i < N + 1; i++) {
            // 스테이지 도달했지만 아직 클리어 못한 플레이어 수
            // 실패율 위해서 float으로
            float stageChallengeNum = (float) clearPeopleNum[i];

            // stage 도전중인 사람이 없으면 제일 쉬운애들이라 스택에 넣고 나중에 하나씩
            // pop해서 더해줄 예정, 자동 오름차순
            if (stageChallengeNum == 0) {
                zeroFailStage.add(i);
                System.out.println("!!! 쉬운 스테이지는 : " + i);
            }
            // 여기서 실패율 따라서 실패율 높은 순으로 정렬을 해야 하는데..
            else {
                float failRate = stageChallengeNum / stageAtPeople;
                stageAtPeople -= stageChallengeNum;
                stageFailMap.put(i, failRate);
                // System.out.println(i+" 스테이지의 실패율 은 " + failRate);
            }
        }

        List<Integer> stageList = new ArrayList<>(stageFailMap.keySet());

        Collections.sort(stageList, (o1, o2) -> stageFailMap.get(o2).compareTo(stageFailMap.get(o1)));

        int index = 0;
        for (int i : stageList) {
            // System.out.println("키 정렬 : " + i);
            answer[index] = i;
            index++;
        }

        while (!zeroFailStage.isEmpty()) {
            answer[index] = zeroFailStage.poll();
            index++;
        }

        return answer;
    }
}

public class FailRate {

}

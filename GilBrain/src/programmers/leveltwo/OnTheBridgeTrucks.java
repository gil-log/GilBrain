import java.util.Queue;
import java.util.LinkedList;

//https://programmers.co.kr/learn/courses/30/lessons/42583
final class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        int onboardTrucksWeight = 0;

        for (int truckWeight : truck_weights) {

            while (true) {
                if (queue.isEmpty()) {
                    queue.add(truckWeight);
                    onboardTrucksWeight += truckWeight;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    int headTruckWeight = queue.poll();
                    onboardTrucksWeight -= headTruckWeight;
                } else {
                    if (onboardTrucksWeight + truckWeight > weight) {
                        queue.add(0);
                        answer++;
                    } else {
                        queue.add(truckWeight);
                        onboardTrucksWeight += truckWeight;
                        answer++;
                        break;
                    }
                }
            }
        }
        answer += bridge_length;

        return answer;
    }
}

public class OnTheBridgeTrucks {

}

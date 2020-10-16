package programmers.levelone;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42840
public class Moyeegosa {

}

class Solution {
    public int[] solution(int[] answers) {
        
        LinkedList<Integer> one = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
        
        LinkedList<Integer> two = new LinkedList<Integer>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        
        LinkedList<Integer> thr = new LinkedList<Integer>(Arrays.asList(3,3,1,1,2,2,4,4,5,5));
        
        int[] score = new int[3];
        
        int temp = 0;
        
        int max = -1;
        
        for(int ans : answers){
            temp = one.removeFirst();
            one.addLast(temp);
            if(ans==temp)
                score[0]++;
            
            temp = two.removeFirst();
            two.addLast(temp);
            if(ans==temp)
                score[1]++;
            temp = thr.removeFirst();
            thr.addLast(temp);
            if(ans==temp)
                score[2]++;
        }
        
        Map<Integer, Integer> scoreMap = new HashMap<Integer, Integer>();
        
        scoreMap.put(1, score[0]);
        scoreMap.put(2, score[1]);
        scoreMap.put(3, score[2]);
        
        
        List<Integer> keySetList = new ArrayList<>(scoreMap.keySet());
        
        Collections.sort(keySetList, (o1, o2) -> (scoreMap.get(o2).compareTo(scoreMap.get(o1))));
        
        if(scoreMap.get(keySetList.get(0)) > scoreMap.get(keySetList.get(1))){
            int [] answer = new int[1];
            answer[0] = keySetList.get(0);
            return answer;
        } else if(scoreMap.get(keySetList.get(0))==scoreMap.get(keySetList.get(2))){
            int [] answer = new int[3];
            answer[0] = keySetList.get(0);
            answer[1] = keySetList.get(1);
            answer[2] = keySetList.get(2);
            return answer;
        } else {
            int[] answer = new int[2];
            answer[0] = keySetList.get(0);
            answer[1] = keySetList.get(1);
            return answer;
        }
        
        
    }
}
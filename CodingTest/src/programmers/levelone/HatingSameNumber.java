package programmers.levelone;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class HatingSameNumber {

}

//https://programmers.co.kr/learn/courses/30/lessons/12906
public class Solution {
    public int[] solution(int []arr) {
        
        Queue <Integer> queue = new LinkedList<>();
        
        queue.add(arr[0]);
        for(int i = 1 ; i < arr.length; i ++){
            if(arr[i]!=arr[i-1])
                queue.add(arr[i]);
        }
        
        int[] answer = new int[queue.size()];
        
        Iterator<Integer> iterator = queue.iterator();
       
        int index = 0;
        while(iterator.hasNext()){
            answer[index] = iterator.next();
            index++;
        }

        return answer;
    }
}
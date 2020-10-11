package programmers.levelthree;
import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42885
public class NineBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        int length = people.length;
        
        if(length ==1 ){
            return 1;
        }
        
        Arrays.sort(people);
        
        int min = 0;
        int max = length - 1;
        
        for(int i = 0; i < length; i++){
           
            if(min == max){
                answer++;
                break;
            } else if(min > max) {
                break;
            }
            if(people[min] + people[max] <= limit){
                answer++;
                min++;
                max--;
            } else {
                answer++;
                max--;
            }
        }
        return answer;
    }

}
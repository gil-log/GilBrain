package programmers.levelone;
import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/68644
public class TwoNumberPickPlus {

}



class Solution {
    public int[] solution(int[] numbers) {
        
        int len = numbers.length;
        
        int count = 0;
        
        for(int i = 0 ; i < len ; i++)
            count+=i;
        
        System.out.println("count : " + count);
        
        int[] beforeAnswer = new int[count];
        
        int index = 0 ;
        
        for(int i = 0 ; i < len ; i++){
            for(int j = i+1; j < len; j++){
                beforeAnswer[index] = numbers[i] + numbers[j];
                index++;
            }
        }
        
        Arrays.sort(beforeAnswer);
        
        int answerLegnth = 1;
        for(int i = 1 ; i < count ; i ++){
            if(beforeAnswer[i] != beforeAnswer[i-1])
                answerLegnth++;
        }
        
        System.out.println(answerLegnth);
        
        int [] answer = new int[answerLegnth];
        
        int temp = -1;
        
        int j = 0;
        for(int ans : beforeAnswer){
            if(temp!=ans){
                answer[j] = ans;
                temp = ans;
                j++;
            }
        }
        
        // System.out.println(answer[1]);
 
        
        return answer;
    }
}


/*

//HashSet ÀÌ¿כ
import java.util.HashSet;
import java.util.Set;

class Solution {
     public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}

*/
package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12943
final class Solution {
    public int solution(int num) {
        int answer = 0;
        
        int count = 1;
        
        long number = num;
        
        if(num == 1)
            return 0;
        
        //500번 카운트
        while(count!=500){
            // 짝수
            if(number % 2 == 0){
                number /= 2;
            } //홀수
            else{
                number = number * 3 + 1;
            }
            
            if(number == 1)
                break;
            
            count++;
        }
        
        if(count == 500)
            answer = -1;
        else if(count != 500)
            answer = count;
        
        return answer;
    }
}
public class CollatzConjecture {

    
}
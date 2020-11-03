package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12947
final class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int hashadNum = x;
        int positionSum = 0;
        
        while(x>0){
            positionSum += x%10;
            x /= 10;
        }
        
        answer = hashadNum % positionSum == 0 ? true : false;
        
        return answer;
    }
}

public class HashadNumber {
    
}

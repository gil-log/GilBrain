package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12944
final class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int num : arr){
         answer += num;   
        }
        answer /= arr.length;
        
        return answer;
    }
}

public class AverageInteger {
    
}

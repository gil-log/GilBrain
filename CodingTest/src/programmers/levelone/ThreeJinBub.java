package programmers.levelone;
import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/68935
public class ThreeJinBub {

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        while(n > 0){
            stack.push(n%3);
            n /= 3;
        }
        
        int ten = 1;
        
        while(!stack.isEmpty()){
            answer+= ten*stack.pop();
            ten*=3;
        }
        
        return answer;
    }
}
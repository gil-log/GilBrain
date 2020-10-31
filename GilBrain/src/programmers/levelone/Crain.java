package programmers.levelone;
import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/64061
public class Crain {

}

final class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        
        //
        
        int load [] = new int [board.length];
        
        
        
        
        //
        
        for(int j = 0 ; j < moves.length; j++){
            for(int i = 0 ; i < board.length; i++){
                
                // �޸������
                if(load[moves[j]-1] > 0)
                    i = load[moves[j]-1];
                
                else if(load[moves[j]-1] == -1)
                    break;
                
                if(board[i][moves[j]-1] != 0){
                    
                    load[moves[j]-1] = i + 1;
                    if(load[moves[j]-1] == board.length)
                        load[moves[j]-1] = -1;
                    
                    if(stack.peek()!=board[i][moves[j]-1]){
                        stack.push(board[i][moves[j]-1]);
                        board[i][moves[j]-1] = 0 ;
                        break;
                    } else{
                        stack.pop();
                        board[i][moves[j]-1] = 0 ;
                        answer+=2;
                        break;
                    }
                    
                }
            }
        }
        
        return answer;
    }
}
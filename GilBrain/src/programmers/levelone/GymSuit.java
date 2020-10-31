package programmers.levelone;

// https://programmers.co.kr/learn/courses/30/lessons/42862
public class GymSuit {
	
	

}


final class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0 ; j < reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        for(int i = 0 ; i < reserve.length; i++){
            for(int j = 0 ; j < lost.length; j++){
                if(lost[j]==reserve[i]+1 || lost[j] == reserve[i]-1){
                    answer++;
                    lost[j] = -1;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}

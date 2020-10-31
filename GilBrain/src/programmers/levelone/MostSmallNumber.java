package programmers.levelone;
//https://programmers.co.kr/learn/courses/30/lessons/12935
class Solution {
    public int[] solution(int[] arr) {
        
        int length = arr.length;
        
        if(length == 1){
            int [] ans = {-1};
            return ans;
        }
        
        int min = arr[0];
        int minIndex = 0;
        
        for(int i = 1 ; i < length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        
        int[] answer = new int [length - 1];
        
        int insertIndex = 0;
        
        for(int i = 0 ; i < length - 1; i++ ){
            if(minIndex == i){
                insertIndex++;
            }
            answer[i] = arr[insertIndex];
            insertIndex++;
        }
        
        return answer;
    }
}
public class MostSmallNumber {

    
}
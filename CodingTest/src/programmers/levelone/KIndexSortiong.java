package programmers.levelone;

import java.util.Arrays;


//https://programmers.co.kr/learn/courses/30/lessons/42748

public class KIndexSortiong {

}



class Solution {
    public int[] solution(int[] array, int[][] commands) {
       
        int leng = commands.length;

        int [] answer = new int[leng];
        
        int cutLeng = 0;
        
        int start = 0;
        int end = 0;
        int findLoc = 0;
        int index = 0;
        
        // 시작 지점, 끝 지점 commands[0~쭉] 읽는중
        for(int i = 0 ; i < leng ; i ++){
            // 인덱스니까 -1 해주었음
            start = commands[i][0] - 1;
            end = commands[i][1] - 1;
            cutLeng = end - start + 1;
            findLoc = commands[i][2];
            
            // 들어갈 개수니까
            int tempArr[] = new int[cutLeng];
            
            // 잘라야 하는 인덱스 확인
            // 마지막 꺼가 안들어가는 상황임
            for(int j = 0 ; j < cutLeng; j ++){
                tempArr[j] = array[start];
                start++;
            }
            
            Arrays.sort(tempArr);
            
            answer[index] = tempArr[findLoc-1];
            
            index++;
            
        }
        return answer;
    }
}


/*



import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}


*/
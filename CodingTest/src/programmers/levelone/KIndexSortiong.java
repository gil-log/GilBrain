package programmers.levelone;

import java.util.Arrays;


//https://programmers.co.kr/learn/courses/30/lessons/42748

public class KIndexSortiong {

}



final class Solution {
    public int[] solution(int[] array, int[][] commands) {
       
        int leng = commands.length;

        int [] answer = new int[leng];
        
        int cutLeng = 0;
        
        int start = 0;
        int end = 0;
        int findLoc = 0;
        int index = 0;
        
        // ���� ����, �� ���� commands[0~��] �д���
        for(int i = 0 ; i < leng ; i ++){
            // �ε����ϱ� -1 ���־���
            start = commands[i][0] - 1;
            end = commands[i][1] - 1;
            cutLeng = end - start + 1;
            findLoc = commands[i][2];
            
            // �� �����ϱ�
            int tempArr[] = new int[cutLeng];
            
            // �߶�� �ϴ� �ε��� Ȯ��
            // ������ ���� �ȵ��� ��Ȳ��
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
package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/17681
final class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = "";
        }

        int[][] binaryArr1 = new int[n][n];
        int[][] binaryArr2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            int index = 0;
            while (arr1[i] > 0) {
                binaryArr1[i][index] = arr1[i] % 2;
                index++;
                arr1[i] /= 2;
            }
            index = 0;
            while (index < n) {
                binaryArr2[i][index] = arr2[i] % 2;
                index++;
                arr2[i] /= 2;
            }

            for (int j = n - 1; j >= 0; j--) {
                if (binaryArr1[i][j] == 1 || binaryArr2[i][j] == 1) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }

        }

        return answer;
    }
}

public class SecreteMap {

}

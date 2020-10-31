package algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arrays = { 6, 32, 36, 49, 43, 29, 19, 28, 16, 41, 45 };

        System.out.println(Arrays.toString(bubbleSort(arrays)));
    }

    static int[] bubbleSort(int[] arr) {
        // 임시 저장용도
        int temp = 0;
        // 특정 회차 정렬 완료 확인 용도 flag
        int doneFlag = 1;
        // 연산 횟수 카운트 용도
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // swap 연산이 수행되는지 확인 하기 위해 flag를 킨다.
            doneFlag = 1;

            // 점차 실행 될때마다 마지막 항은 제일 큰 값이므로 연산하지 않음
            for (int j = 1; j < arr.length - i; j++) {
                // 이전 인덱스가 현재 인덱스보다 값이 큰 경우 스왑 발생
                if (arr[j - 1] > arr[j]) {
                    // temp에 이전 인덱스 값 저장
                    temp = arr[j - 1];
                    // 현재 값 이전 인덱스로 스왑
                    arr[j - 1] = arr[j];
                    // 이전 값 현재 인덱스로 스왑
                    arr[j] = temp;

                    // swap 연산이 수행되었다는 확인을 하고 flag를 끈다.
                    doneFlag = 0;
                }
                
                // 연산 횟수 카운트
                count++;
            }

            // swap 연산이 한 번도 수행되지 않았으면 
            // 정렬이 done 되었으므로 연산을 종료한다.
            if (doneFlag == 1)
                break;
        }

        System.out.println("연산 수행 횟수는 : "+ count);
        return arr;
    }
}

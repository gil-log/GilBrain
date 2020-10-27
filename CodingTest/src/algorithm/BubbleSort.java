package algorithm;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        
        int [] arrays = {6, 32, 36, 49, 43, 29, 19, 28, 16, 41, 45};

        System.out.println(Arrays.toString(bubbleSort(arrays)));
    }
    static int[] bubbleSort(int[] arr) {
        // 임시 저장용도
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            // 점차 실행 될때마다 마지막 항은 제일 큰 값이므로 연산하지 않음
            for(int j= 1 ; j < arr.length-i; j++) {
                // 이전 인덱스가 현재 인덱스보다 값이 큰 경우 스왑 발생
                if(arr[j-1] > arr[j]) {
                    // temp에 이전 인덱스 값 저장
                    temp = arr[j-1];
                    // 현재 값 이전 인덱스로 스왑
                    arr[j-1] = arr[j];
                    // 이전 값 현재 인덱스로 스왑
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

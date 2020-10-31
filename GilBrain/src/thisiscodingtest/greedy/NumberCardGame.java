package thisiscodingtest.greedy;

import java.util.Arrays;

//96P
public class NumberCardGame {
	public static void main(String[] args) {
		
		int arrOne[][] = {{3, 1, 2}, {4, 1, 4}, {2, 2, 2}};
		
		int arrTwo[][] = {{7, 3, 1, 8}, {3, 3, 3, 4}};
		System.out.println(solution(2,4,arrTwo));
	}
	
	static int solution(int N, int M, int arr[][]) {
		int temp[] = new int[M];
		
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			temp = arr[i];
			Arrays.sort(temp);
			if(temp[0]>max)
				max = temp[0];
		}
		
		return max;
	}
}


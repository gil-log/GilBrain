package thisiscodingtest.greedy;

import java.util.Arrays;

//92P
public class BigNumberRule {
	public static void main(String[] args) {
		
		int N = 5;
		int M = 7;
		int K = 2;
		int [] number = {3, 4, 3, 4, 3};
		
		System.out.println(solution(N, M, K, number));
		
	}
	
	static int solution(int N, int M, int K, int[] number) {

		int answer = 0;
		
		Arrays.sort(number);
		
		// �迭 ���� �� ���� ū ��
		int kingNumber = number[N-1];
		
		System.out.println(kingNumber);
		// �迭 ���� �� �ι�°�� ū ��
		int queenNumber = number[N-2];
		System.out.println(queenNumber);
		
		int times = M / (K+1);
		
		
		System.out.println(times);
		
		answer = ( (kingNumber * K) + queenNumber ) * times;
		
		M -= times * (K+1);
		
		answer += kingNumber * M;
		
		return answer;
	}
}

package programmers.levelthree;

import java.util.Scanner;

import programmers.leveltwo.Solution;

//https://programmers.co.kr/learn/courses/30/lessons/12900

public class TwoNTyling {
	  public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
		  int n = 0;
		  n = sc.nextInt();
		  Solution s = new Solution();
		  int result = 0;
		  result = s.solution(n);
		  System.out.println(result);
	}
}

class Solution {
	/*
	 * public int solution(int n) { int answer = 0; if(n == 2 || n==1) { return
	 * answer = 1; } double to = 1; double o = n; long ban = 1; for(int i = 1; i <=
	 * (n/2); i++) { o-=2; to = 1; for(double j =(double) i; j > 0; j--) {
	 * to*=(o+j)/j; } ban += to; } answer = (int)(ban%1000000007); return answer; }
	 * aaaaaa
	 */
    
	
	int fn[] = new int[60001];
	

    public int solution(int n) {
        int answer = 1;

        fn[1] = 1;
        fn[2] = 2;
        
        answer  = recursion(n) ;
        
        return answer;
    }
	
    public int recursion(int t) {
    	
    	if(fn[t] != 0) {
    		return fn[t];
    	}
        
        fn[t] = recursion(t-2) + recursion(t-1);
    	
        fn[t] %= 1000000007;
        
    	return fn[t];
    	
    }
}
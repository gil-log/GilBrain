package programmers.leveltwo;
//https://programmers.co.kr/learn/courses/30/lessons/43165
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    private int dfs(int[] numbers, int node, int sum, int target){
        
        if(node == numbers.length){
            if(sum==target)
                return 1;
            return 0;
        }
        
        return dfs(numbers, node+1, sum + numbers[node], target) 
        	 + dfs(numbers, node+1, sum - numbers[node], target);
    }
}
public class TargetNumber {
    
}

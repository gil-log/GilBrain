package programmers.levelone;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

//https://programmers.co.kr/learn/courses/30/lessons/12910
final class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        //���� �ڷ��� �迭��[] = Set��.toArray(new ���� �ڷ���[Set��.size()]); 
        
        Set<Integer> treeSet = new TreeSet<Integer>();
        
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]%divisor==0)
                treeSet.add(arr[i]);
        }
        
        if(treeSet.size() == 0){
            int [] answer = {-1};
            return answer;
        }
        int [] answer = new int [treeSet.size()];
        
        Iterator iterator = treeSet.iterator();
        
        int index = 0;
        while(iterator.hasNext()){
            answer[index] = (int)iterator.next();
            index++;
        }
        
        return answer;
    }
}
public class DivisorNumberArray {

}

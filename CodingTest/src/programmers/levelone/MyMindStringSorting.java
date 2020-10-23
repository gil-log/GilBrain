package programmers.levelone;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12915
class Solution {
    public String[] solution(String[] strings, int n) {
        
        int leng = strings.length;
        
        Arrays.sort(strings);
        
        Map<Integer, Character> map = new HashMap<>();
        
        for(int i = 0 ; i < leng; i++){
            map.put(i, strings[i].charAt(n));
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        Collections.sort(keySet, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
        
        String[] answer = new String[leng];
        
        for(int i = 0 ; i < leng; i++){
            answer[i] = strings[keySet.get(i)];
        }
        
        return answer;
    }
}
public class MyMindStringSorting {

}

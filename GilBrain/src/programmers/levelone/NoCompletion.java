package programmers.levelone;
import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42576
public class NoCompletion {

	
}

final class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hash = new HashMap<>();
        
        for(String a : participant){
            hash.put(a, hash.getOrDefault(a, 0) + 1);
        }
        
        for(String c : completion){
            hash.put(c, hash.get(c) - 1);
        }
        for(String h : hash.keySet()){
            if(hash.get(h) != 0){
                return h;
            }
        }
        
        
        return null;
    }
}
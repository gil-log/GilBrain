package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapCollectionTest {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("a", 1);
		hashMap.put("a", 4);
		hashMap.put("b", 2);
		hashMap.put("c", 3);
		
		Set<String> keySet = hashMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		
		while(keyIterator.hasNext()) {
		  String key = keyIterator.next();
		  Integer value = hashMap.get(key);
		  System.out.println(key + "의 값은 : "+value);
		}
		
		System.out.println();
		
		Set<Map.Entry<String,Integer>> entrySet = hashMap.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + "의 값은 : "+value);
		}
	}
}

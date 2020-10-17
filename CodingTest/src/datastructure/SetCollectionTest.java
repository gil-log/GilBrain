package datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionTest {
	public static void main(String[] args){
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		
		
		Iterator<String> hashIter = hashSet.iterator();
		
		while(hashIter.hasNext()){
			System.out.println(hashIter.next());
		}
		
		System.out.println();
		
		// treeSet은 오름차순 정렬 이므로 출력 결과 a, b, c
		treeSet.add("a");
		treeSet.add("c");
		treeSet.add("b");
		
		Iterator<String> treeIter = treeSet.iterator();
		
		while(treeIter.hasNext()) {
			System.out.println(treeIter.next());
		}
		
		System.out.println();
		
		linkedHashSet.add("a");
		linkedHashSet.add("a");
		linkedHashSet.add("c");
		linkedHashSet.add("b");
		
		Iterator<String> linkedIter = linkedHashSet.iterator();
		
		
		
		while(linkedIter.hasNext()) {
			System.out.println(linkedIter.next());
		}
		
		
	}

}

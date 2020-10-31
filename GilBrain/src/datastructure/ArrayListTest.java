package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// �����ÿ� �Ű������� �뷮 20 ����
		List<String> arrayList = new ArrayList<String>(20);
		
		// data ����
		arrayList.add("A");
		
		// �����ϰ� ���� �ε����� ������ ����
		arrayList.add(1,"B");
		
		// ������ ���
		int size = arrayList.size();
		
		// �ش� �ε����� ��ü ��������
		String getStr = arrayList.get(1);
		
		// �ش� �ε����� ��ü ����
		arrayList.remove(1);
		
		// �ε��� 1�� ��ü�� "AA"�� ����
		arrayList.set(1, "AA");
		
		// �ش� ��ü�� �����ϸ� true�� return
		boolean tr = arrayList.contains("A");
		
		// list�� ������� true�� return
		boolean fa = arrayList.isEmpty();
		
		// list ����
		arrayList.clear();
		
		//���ʸ� Ÿ�Կ� �°� asList()�� �Ű����� ���������� �Է��ϰų�,
		List<String> list = Arrays.asList("��", "��");
		
		//���ʸ� Ÿ���� �迭�� �Ű������� �ָ� �����͸� �����ϸ� ���� �� �� �ִ�.
		Integer [] intgerArray = {1,2,3};
		List<Integer> list2 = Arrays.asList(intgerArray);
		
		System.out.println(list.get(0));
		
	}
}

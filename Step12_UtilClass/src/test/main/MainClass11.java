package test.main;

import java.util.*;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * HashSet �� set �������̽��� ������ Ŭ����.
		 * -������ ����.
		 * -key���� ����.
		 * -�ߺ� ��� ����.
		 * -� �����͸� ����(����)���� �����ϰ��� �� �� ����Ѵ�.
		 */
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		// �̷��� �غ��� �ߺ��� �� ���ŵ�.
		// ������ ����. ���� ���� �� ��.
		
		// ���ڿ��� ���� ����. ���� �ߺ��� ���ŵ�.
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("kim");
		set2.add("park");
		set2.add("lee");
		set2.add("lee");
		
		
		
	}
}

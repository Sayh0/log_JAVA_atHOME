package test.main;

import java.util.*;

public class MainClass09 {
	public static void main(String[] args) {
		//�ڹٽ�ũ��Ʈ���� Ű : ��� �� �����ϴ� ��ó��.
		HashMap<String, String> dic=new HashMap<>();
		dic.put("house", "��");
		dic.put("phone", "��ȭ��");
		dic.put("car", "�ڵ���");
		dic.put("pencil", "����");
		dic.put("eraser", "���찳");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String line=scan.nextLine();
		String mean=dic.get(line);
		
		if(mean != null) {
			System.out.println(line+"�� ���� \'"+mean+"\'�Դϴ�.");
		} else {
			System.out.println(line+" �ܾ�� ��Ͽ� �����ϴ�.");
		}
		
		System.out.println("\n ���Ʒ��� ���� �ڵ��Դϴ�. \n");
		
		boolean isHere=dic.containsKey(mean);
		if (isHere) {
			System.out.println(line+"�� ���� \'"+mean+"\'�Դϴ�.");
		} else {
			System.out.println(line+" �ܾ�� ��Ͽ� �����ϴ�.");
		}
		
		

	}
}

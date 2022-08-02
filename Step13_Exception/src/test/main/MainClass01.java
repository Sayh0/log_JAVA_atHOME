package test.main;

import java.util.*;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		String inputNum=scan.nextLine(); //���� ������ ���ڿ� �Է¹���. ex)10 20 10.1 ...
		try {
			double num=Double.parseDouble(inputNum); //�Է��� ���ڿ��� ���ڷ� ��ȯ
			
			double result=num+100; //�Է��� ���� + 100
			System.out.println("�Է� ���� + 100 : "+result);
		} catch(NumberFormatException nfe) { //nfe�� ���ܰ�ü�� �������� ��.
			System.out.println("���ڸ� �Է��ϼ���! ");
			System.out.println(nfe.getMessage());
			//�ֿܼ� �ڼ��� ���޼��� ���
			nfe.printStackTrace();
		}
		
		
		System.out.println("�޼ҵ尡 ����˴ϴ�.");
	}
}

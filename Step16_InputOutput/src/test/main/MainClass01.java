package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		
		//Ű����� ����� InputStream type�� �������� kbd��� ���������� ���
		//InputStream ��ü�� 1byte ����(2���� 8�ڸ� 0000 0000 256��) ó����Ʈ���̴�.
		//2byte ó���� �ϸ� �� ���� ���ڿ� ���� ó�� ����
		//��ҿ�����, ����, Ư���� ó�� ����(�ѱ� ó�� �Ұ�)
		
		InputStream kbd=System.in;
		System.out.println("�Է� : ");
		try {
			int a=kbd.read(); //�Է��� ������ �ڵ尪���� ���. �׷��� int�� �޴� ��.
			System.out.println("code : "+a); //�ڵ尪
			char ch=(char)a;
			System.out.println("char : "+ch);//����. (�� �ٵ� �ѱ� ó���� �ȵ�)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package test.main;

import java.util.*;

public class MainClass15 {
	public static void main(String[] args) {
		//random ���ڸ� ���� random ��ü
		Random ran=new Random();
		
		int a=ran.nextInt(); // int ���� ������ �������� ����
		
		int b=ran.nextInt(10); // ������ ���� ������ �ڴ��� ���� ���� 0-9
		
		int c=ran.nextInt(20); // 0-19
		
		int d=ran.nextInt(15)+1; // 1-15 0-14+1
	}
}

package test.main;

import java.util.*;

import test.mypac.SleepyException;

public class MainClass05 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		for(int i=0;i<100;i++) {
			int ranNum=ran.nextInt(10); //0-9���� ������ ���� �߻�
			if(ranNum==5) { //�쿬�� ������ ���� 5�� ������ ���� �߻���Ŵ
				throw new SleepyException("�ʹ� ����~"); //throw ������ �Բ� ���ܰ�ü ���� �� ���� �߻�
			}
			
			System.out.println(i+1+"��° �۾��� . . .");
			
		}
		System.out.println("���� �޼ҵ� ����.");
		
	}
}

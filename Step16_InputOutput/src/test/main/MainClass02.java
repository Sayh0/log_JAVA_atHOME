package test.main;

import java.io.*;

public class MainClass02 {
	public static void main(String[] args) {
		//1byte ó�� ��Ʈ��
		InputStream is=System.in;
		//2byte ó�� ��Ʈ�� (256 * 256 65536��)
		InputStreamReader isr=new InputStreamReader(is); //������ ���ڷ� ��ǲ��Ʈ�� Ÿ�� ����
		System.out.println("�Է� : ");
		try {
			int code=isr.read(); //�ѱ��ڹۿ� �� ����
			System.out.println("code : "+code); //�ڵ尪
			char ch=(char)code;
			System.out.println("char : "+ch);//����.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

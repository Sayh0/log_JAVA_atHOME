package test.main;

import java.io.*;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		ps.println("hello");
		System.out.println("hello two");
		
		//�н��� ���ؼ� PrintStream ��ü�� �θ� type OutputStream ���� �޾ƺ���.
		OutputStream os =ps; //1byte ó�� ��Ʈ���̴�.
		try {
			os.write(97); //����� �غ� ������ �Ǿ� �ִ� ���.
			os.write(44032); //�ѱ��� �� ����. 1����Ʈ��.
			os.flush(); //������ �� ����� ��.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

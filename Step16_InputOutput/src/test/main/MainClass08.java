package test.main;

import java.io.*;

public class MainClass08 {
	public static void main(String[] args) {
		File f=new File("c:/");
		File[] files=f.listFiles(); //file��ü ��� ����
		for(File tmp:files) { //�ݺ��� ���鼭 file��� ��ü �ϳ��� �����ؼ�
			if(tmp.isDirectory()) { //������ ���丮�̸�
				System.out.println("[ "+tmp.getName()+" ]"); //���ȣ ���
			} else {
				System.out.println(tmp.getName());
			}
		}
		
		
	}
}

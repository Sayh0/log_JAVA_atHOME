package test.main;

import java.io.*;

public class MainClass10 {
	public static void main(String[] args) {
		//���� �����
		/*
		 *  �� �ڵ带 �����ؼ�
		 *  ���� 1000�� �����
		 */
		//�����
		for(int i=0;i<1000;i++) {
			File f1=new File("c:/acorn202206/MyFolder/folder"+i);
			if (f1.exists()) {
				f1.delete();
			} else {
				f1.mkdir();
			}
		}
		
	}
}

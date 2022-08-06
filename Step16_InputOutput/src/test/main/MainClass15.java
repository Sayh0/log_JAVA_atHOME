package test.main;

import java.io.*;

public class MainClass15 {
	public static void main(String[] args) {
		//�ʿ��� ������ ���� �������� �̸� �����
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("c:/acorn202206/myFolder/1.jpg"); //read
			fos=new FileOutputStream("c:/acorn202206/myFolder/copied.jpg"); //copy
			
			//�о 1byte ����ϱ�
			while(true) {
				int data=fis.read(); //read 1byte
				if (data == -1) break;
				fos.write(data); 
				fos.flush();
			}
		} catch (Exception e) {
	         e.printStackTrace();
		} finally {
				try {
					if(fos!=null) fos.close(); //null check
					if(fis!=null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}

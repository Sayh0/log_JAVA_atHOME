package test.main;

import java.io.*;

public class MainClass16 {
	public static void main(String[] args) {
		//�ʿ��� ������ ���� �������� �̸� �����
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("c:/acorn202206/myFolder/1.jpg"); //read
			fos=new FileOutputStream("c:/acorn202206/myFolder/copied.jpg"); //copy
			
			//byte �˰��̸� ���� �� 1024��¥�� byte[] ����
			byte[] buffer=new byte[1024]; //�ѹ��� 1kb�� �о �� �ִ�.
			while(true) {
				//byte[] ��ü read{} �޼ҵ忡 ����, �� byte�� �о����� ���Ϲ޴´�.
				int readByte=fis.read(buffer);
				if(readByte==-1)break;
				fos.write(buffer, 0, readByte); //0���濡������ ���� ��ŭ�� ���
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

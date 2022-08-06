package test.main;

import java.io.*;

public class MainClass11 {
	public static void main(String[] args) {
		//���ڿ� ������ ������ ����� ���� file ��ü
		File memoFile=new File("c:/acorn202206/MyFolder/memo.txt");
		
		try {
			if(!memoFile.exists()) {
				memoFile.createNewFile();
			}
			//���Ͽ� ���ڿ� ����� �� �ִ� FileWriter ��ü 
			FileWriter fw=new FileWriter(memoFile, true); //���Ͽ��ٰ� ���ڿ� ��� ����, ���� �ؽ�Ʈ (append)�ѱ�.
			fw.write("String text is written here");
			fw.write("\n");
			fw.write("ABCDEFU");
			fw.write("\n");
			fw.write("lalala");
			fw.write("\n");
			fw.flush();
			fw.close();// ����� ��ġ�� �������� �Ѵ�.
			System.out.println("txt save completed");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

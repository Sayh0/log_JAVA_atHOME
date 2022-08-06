package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
	      File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
	      try {
	         //���Ͽ��� ���ڿ��� �о���ϼ� �ִ� ��ü ����
		      FileReader fr=new FileReader(memoFile);
		      BufferedReader br=new BufferedReader(fr); 
	         //�ݺ��� ���鼭
	         while(true) {
	            //���� ���� �о��
	        	 String liner=br.readLine(); //�����ȣ�� �о�� ����.
	            //���� ���̻� ���� code ���� ������
	            if(liner == null) {
	               break;//�ݺ��� Ż��
	            }
	            
	            System.out.println(liner);
	         }
	         
	         
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	}
}

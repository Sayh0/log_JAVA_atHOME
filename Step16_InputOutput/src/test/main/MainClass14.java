package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
	      File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
	      //�ʿ��� ��ü ���� �������� �̸� ���(final �� ��� ������ �ڷ� ��.
	      FileReader fr=null;
	      BufferedReader br=null;
	      try {
	         //���Ͽ��� ���ڿ��� �о���ϼ� �ִ� ��ü ����
		      fr=new FileReader(memoFile);
		      br=new BufferedReader(fr); 
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
	      } finally {
	    	  try {
	    		if(br != null)//������Ʈ������
				br.close();
	    		if(fr != null)//������Ʈ������
		    	fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	      }
	}
}

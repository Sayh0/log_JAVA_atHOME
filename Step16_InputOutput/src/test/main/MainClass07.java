package test.main;

import java.io.*;

public class MainClass07 {
	public static void main(String[] args) {
		
		// c:/�� access �� �� �ִ� file ��ü ����
		File f=new File("c:/");
		String[] fileNames=f.list();
		//�迭�� ��� �ִ� ���ڿ� ��� ����ϱ�.
	      for(int i=0; i < fileNames.length ; i++) {
	          System.out.println("fileNames:"+fileNames[i]);;
	       }
	      for (String tmp:fileNames) {
	    	  System.out.println(tmp);
	      }
		
	}

}

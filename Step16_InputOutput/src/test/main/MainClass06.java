package test.main;

import java.io.*;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os=ps;
		OutputStreamWriter osw=new OutputStreamWriter(os);
		// InputStreamReader <-> OutputStreamWriter
		
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("�ϳ�");
			bw.newLine();
			bw.write("�ο�\r");
			bw.write("����");

			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

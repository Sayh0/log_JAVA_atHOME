package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("��ī��");
		names.add("������");
		names.add("���̸�");
		names.add("���α�");
		names.add("������");
		
		for(int i=0;i<names.size();i++) {
			String tmp=names.get(i);
			System.out.println(i+1+" ��° ģ�� : "+tmp);
		}
	}
}

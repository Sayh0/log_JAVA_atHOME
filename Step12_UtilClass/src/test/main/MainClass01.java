package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>(); //���� �迭 ArrayList.
		// "��ī��', "������", "���̸�" 3���� String type�� ������ ����.
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		//0���� ������ �ҷ��� item �̶�� ������ ���
		String item=names.get(0);
		//1���� ������ �����ϱ�
		names.remove(1);
		//0���濡 "������" �ֱ�
		names.set(0, "������");
		//����� �������� ����(size) �� size��� ���ú����� ���
		int size=names.size();
		//����� ��� ������ ����
		names.clear();
	}
}

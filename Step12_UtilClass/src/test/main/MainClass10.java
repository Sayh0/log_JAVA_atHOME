package test.main;

import java.util.*;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * ȸ�������� ����int ����String ���� �����Ǿ� �ֱ� ������
		 * value�� generic �� Object�� �����ؾ� �Ѵ�.
		 * ��� ������ ���� ������(ĳ������ �ʿ�).
		 */
		Map<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "�豸��");
		map.put("addr", "�뷮��");
		
		//������ �ö��� Object type�̶� num �����ö� ������Ʈ Ÿ������ �� �޴´�. �׷���~
		//������Ʈ Ÿ������ ���ϵǱ� ������ ���� type���� ĳ�����ع�����
		int num=(int)map.get("num"); //Ÿ��ĳ����
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		
		//�ؽ����� �ڹٽ�ũ��Ʈ�� { key: value } �� ����~~
		
	}
}

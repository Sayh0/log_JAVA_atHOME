package test.main;

import java.util.ArrayList;

import test.mypac.Member;

public class MainClass0702 {
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();
		/*
		 * ���� for �� �̿��ϱ�
		 * 
		 * String[] arr = {"ȫ�浿","�ƹ���","ȣȣȣ"};
		 *
		 * for( String str : arr) {		
		 * 		System.out.println(str);
		 * }
		 * for( �ڷ��� ������ : �迭��) {
		 * 		����
		 * }
		 */
	
		Member[] mems = {
		   new Member(1, "a1", "����"),
		   new Member(2, "a2", "����"),
		   new Member(3, "a3", "����")
		};
	
		for(Member mem:mems) {
		   members.add(mem);
		}
	
		for(Member member:members) {
		   System.out.print("��ȣ : "+member.num+", ");
		   System.out.print("�̸� : "+member.name+", ");
		   System.out.println("�ּ� : "+member.addr);
		}
	}
}

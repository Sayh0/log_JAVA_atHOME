package test.main;

import java.util.*;

import test.mypac.Member;

public class MainClass07 {
	public static void main(String[] args) {
		List<Member> members=new ArrayList<Member>();
		Member mem1=new Member(1, "�豸��", "�뷮��");
		Member mem2=new Member(2, "�ذ�", "��ŵ�");
		Member mem3=new Member(3, "���", "�󵵵�");
		
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
				
		for(int i=0; i<members.size(); i++) {
            System.out.println("��ȣ: "+members.get(i).num+
            		          " �̸�: "+members.get(i).name+
            		          " �ּ�: "+members.get(i).addr);
        }
		System.out.println("");
		
		for(Member tmp:members) {
          System.out.println("��ȣ: "+tmp.num+", �̸�: "+tmp.name+", �ּ�: "+tmp.addr);
		}
	}
}
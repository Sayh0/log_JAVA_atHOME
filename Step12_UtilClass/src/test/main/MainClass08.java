package test.main;

import java.util.*;

import test.mypac.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		List<MemberDto> members=new ArrayList<MemberDto>();
		
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("�豸��");
		dto1.setAddr("�뷮��");
		
		MemberDto dto2=new MemberDto(2, "�ذ�", "��ŵ�");
		MemberDto dto3=new MemberDto(2, "������", "�󵵵�");
		
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		for(MemberDto temp:members) {
			System.out.println("��ȣ : "+temp.getNum()
							+", �̸� : "+temp.getName()
							+", �ּ� : "+temp.getAddr());
		}
		

	}
		
}



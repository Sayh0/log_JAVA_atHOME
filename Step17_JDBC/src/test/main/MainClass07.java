package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		//member ���̺� �߰��� ȸ�� ����.
		String name="Joodaengee";
		String addr="BongChundong";
		
		//ȸ�� �Ѹ��� ������ MemberDto ��ü�� ���
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//�޼ҵ带 ȣ���ϸ鼭 MemberDto ��ü�� ����.
		insert(dto);
		
	}
	
	//ȸ�� �Ѹ��� ������ �߰��ϴ� �޼ҵ�
	public static void insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
	
		try {conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        try {
    		String sql="INSERT INTO member"
 	               + " (num, name, addr)"
 	               + " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, dto.getName());
	        pstmt.setString(2, dto.getAddr()); 
	        pstmt.executeUpdate();
	        System.out.println("member Update completed.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ݴ� �� ������ ���� �Ųٷ�.
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}
	}
}

package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.util.DBConnect;

public class MainClass066 {
	public static void main(String[] args) {
		
		//member_seq �̶�� �������� �̿��ؼ� �Ʒ��� ȸ�� ������ �߰��غ���.
		String name="Park";
		String addr="HangShinDong";
		
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
	        pstmt.setString(1, name);
	        pstmt.setString(2, addr); 
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

package test.main;

import java.sql.*;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1�� ȸ���� ���� �����ϱ�
		 * 
		 */
		int num=1;
		String name="Acorn";
		String addr="GangnamStn";
		
		Connection conn=null; //DB���ᰴü ���� �������� ����
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
	        conn=DriverManager.getConnection(url, "scott", "tiger");
	        System.out.println("Oracle DB connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    PreparedStatement pstmt=null;
	    
        try {
        	//������ ������.(�̿ϼ��� �� ����)
            String sql="UPDATE member"
                    + " SET name=?"
                    + "   , addr=?"
                    + " WHERE num=?";
			pstmt=conn.prepareStatement(sql); //insert update ���� ���� �����ϴ� ��ü.
			// ������ sql�� ������ �� �����. �̿ϼ� ����ǥ�� ������� �� ����
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			pstmt.executeUpdate();
			System.out.println("Update complete");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("main method terminated");
	}
}

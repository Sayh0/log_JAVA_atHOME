package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * run ���� �� member���̺��� 1�� ȸ���� ���� ����.
		 */
		int num=4;

		
		Connection conn=null; //DB���ᰴü ���� �������� ����
		//Ŀ�ؼ��� ������ �� �κ��� �Ź� ���ϰž�. �̸� �������°� ���� ������?
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
	        conn=DriverManager.getConnection(url, "scott", "tiger"); //Ŀ�ؼ� ��ü ������ ������.
	        System.out.println("Oracle DB connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    PreparedStatement pstmt=null;
	    
        try {
        	//������ ������.(�̿ϼ��� �� ����)
            String sql="DELETE FROM member"
            		+ " WHERE num=?";

			pstmt=conn.prepareStatement(sql); //insert update delete ���� �����ϴ� ��ü. ���� ������ 3���� �Ȱ���.
			// ������ sql�� ������ �� �����. �̿ϼ� ����ǥ�� ������� �� ����
			//? �� ���ε�(����)�� ������ ������ ����.
			pstmt.setInt(1, num);
			pstmt.executeUpdate(); //����. select ���� ȣ���ϴ� �޼ҵ尡 �ٸ���!!! executeQuery��!! ����� �����;ߵǴϱ�!!
			System.out.println("Update complete");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("main method terminated");
	}
}

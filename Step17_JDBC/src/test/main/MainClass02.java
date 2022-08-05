package test.main;

import java.sql.*;

public class MainClass02 {
	public static void main(String[] args) {
	      //DB ���ᰴü�� ���� ���� ���� �����
	      Connection conn=null;
	      try {
	         //����Ŭ ����̹� �ε�
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //������ DB �� ���� @�������ּ�:port��ȣ:db�̸�
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //���� ��й�ȣ�� �̿��ؼ� Connection ��ü�� ������ ������
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //���ܰ� �߻����� �ʰ� ������� ��������� �������� ���� �����̴�.
	         System.out.println("Oracle DB ���� ����");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      //member ���̺� �߰��� ȸ�� ����
	      int num=4;
	      String name="hong";
	      String addr="Incheon";
	      //
	      //SELECT �۾��� ���ؼ� �ʿ��� ��ü�� �������� ���� �������� �̸� ����� 
	      PreparedStatement pstmt=null;
	      //result�� ���� select���� ����� �ʿ������ �ʿ����. 
	      try {
	         //������ �̿ϼ��� sql ��
	         String sql="INSERT INTO member"
	               + " (num, name, addr)"
	               + " VALUES(?, ?, ?)"; //�����͸� ������� ��ġ�� ? �����.
	         //PreparedStatement ��ü�� ������ ������
	         pstmt=conn.prepareStatement(sql);
	         // ? �� ���� ���ε��ؼ� �̿ϼ��� sql ���� �ϼ� ��Ų��.
	         pstmt.setInt(1, num);
	         pstmt.setString(2, name);
	           pstmt.setString(3, addr); //1, 2, 3 �� �� ����ǥ�� ����.
	           //sql �� �����ϱ�
	           pstmt.executeUpdate(); //executeQuery �� �ƴϴ�! �μ�Ʈ ���� �����̱� ������ ������Ʈ �޼ҵ带 ȣ��.
	           System.out.println("ȸ�� ������ �����߽��ϴ�.");
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      
	   }
	}


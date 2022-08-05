package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {
	public static void main(String[] args) {
	      //DB ���ᰴü�� ���� ���� ���� �����
	      Connection conn=null;
	      //Ŀ�ؼ� ��ü�� �޼ҵ带 ���� ��. ����̺�Ŵ��� Ŭ������ ��Ŀ�ؼ��̶�� ����ƽ �޼ҵ带 ����.
	      //�츮�� ���� �� Ŀ�ؼ� ���� �ʾƵ� ����. �޼ҵ� ȣ���ؼ� �� ���ϰ��� ����� ���� �ִ�.
	      //url �޾ƿͼ� ���°Ŵϱ� ���˿� �� �����./
	      
	      
	      try {
	         //����Ŭ ����̹� �ε�
	         Class.forName("oracle.jdbc.driver.OracleDriver"); //ojdbc ����̹��� �ε��Ѵٴ� ��.����̹��� �־�� ���ư�����.
	         //������ DB �� ���� @�������ּ�:port��ȣ:db�̸�
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //���� ��й�ȣ�� �̿��ؼ� Connection ��ü�� ������ ������
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //���ܰ� �߻����� �ʰ� ������� ��������� �������� ���� �����̴�.
	         System.out.println("Oracle DB ���� ����");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      //select �۾��� ���� �ʿ��� ��ü ������ ���� �������� �̸� �����
	      PreparedStatement pstmt=null;//PreparedStatement ��ü�� �̿��� query�� �����ϰ� 
	      ResultSet rs=null;//������� resultSet ��ü�� �޾ƿ���.
	      try {
	    	  //������ SQL��
	    	  String sql="SELECT num, name, addr FROM member"
	    	  		   +" ORDER BY num ASC"; /*���ο� �ٿ��� ������ ��ĭ �����*/
	    	  //Ŀ�ؼ� �������̽��� PreparedStatement�� ��ü�� ������ �������ִ� �޼ҵ�.
	    	  //peparedStatement�� �������� �����ִ� �޼ҵ�.
	    	  pstmt=conn.prepareStatement(sql);
	    	  //PreparedStatement ��ü�� �̿��� query�� �����ϰ� ����� 
	    	  //resultSet ��ü�� �޾ƿ���.
	    	  rs=pstmt.executeQuery(); //�������� �����ִ� �����. �߿�.
	    	  /*
	    	   *  ResultSet ��ü�� .next() �޼ҵ�� cursor �ؿ� row�� �����ϴ��� Ȯ���ؼ�
	    	   *  ���� �����ϸ� true�� �����ϰ� cursor�� �� ĭ ������ �̵��Ѵ�
	    	   *  ���� �������� ������ false�� �����Ѵ�.
	    	   */
	    	  while(rs.next()) { //�ݺ���. next�� Ŀ���� ������. ���̻� row �� ������ false �� ��ȯ
	    		  //���� cursor �� ��ġ�� ������ num �̶�� �÷��� ���� ����
	    		  int num=rs.getInt("num");
	    		  //���� cursor �� ��ġ�� ������ name �̶�� �÷��� ���ڿ� ����
	    		  String name=rs.getString("name");
	    		  //���� cursor �� ��ġ�� ������ addr �̶�� �÷��� ���ڿ� ����
	    		  String addr=rs.getString("addr");
	    		  //�ܼ�â�� ����ϱ�
	    		  System.out.println(num+" | "+name+" | "+addr);
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	      System.out.println("�޼ҵ� ����");
	}
}

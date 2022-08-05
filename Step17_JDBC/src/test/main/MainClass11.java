package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass11 {
   public static void main(String[] args) {
      int num=1;
      //���� ���� num �� ��� ������ �޼ҵ��� ���ڷ� �����ؼ� ȸ�� �Ѹ��� ������ ����.
      MemberDto dto=getData(num);
      if(dto == null) {
         System.out.println(num+" �� ȸ���� ���� ���� �ʽ��ϴ�.");
      }else {
         System.out.println(num+" �� ȸ���� �̸��� "+dto.getName()+
               " �̰� �ּҴ� "+dto.getAddr()+" �Դϴ�.");
      }
   }
   
   //���ڷ� ���޵Ǵ� ��ȣ�� �ش�Ǵ� ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
   public static MemberDto getData(int num){
      //�ʿ��� ��ü�� ���� ���� ������ �̸� �����. 
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      
      MemberDto dto=null;
      try {
         conn=new DBConnect().getConn();
         //������ sql�� �����ϱ� 
         String sql="SELECT name, addr"
               + " FROM member"
               + " WHERE num=?";
         pstmt=conn.prepareStatement(sql);
         // ? �� ���ε� �� ������ ������ �Ѵ�.
         pstmt.setInt(1, num);
         // select �� �����ϰ� ����� ResultSet ���� ����
         rs=pstmt.executeQuery();
         /*
          *  primary key �� select �� �ϰ� �Ǹ� select �� row �� �ִ� 1�� �̹Ƿ�
          *  cursor �� �ݺ��� ���鼭 ������ ���� �ʿ䰡 ����. 
          *  �� rs.next() �� �ѹ��� ����Ǹ� �ȴ�. 
          */
         if(rs.next()) {
            //Ŀ���� ��ġ�� ������ select �� Į�� ������ ����.
            String name=rs.getString("name");
            String addr=rs.getString("addr");
            //select �� ������ MemberDto ��ü�� �����ؼ� ��´�.
            dto=new MemberDto();
            dto.setNum(num);
            dto.setName(name);
            dto.setAddr(addr);
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //select �� row �� ���ٸ� dto �� null �̴�. 
      return dto;
   }
}
























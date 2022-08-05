package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {
	public static void main(String[] args) {
	      //DB 연결객체를 담을 지역 변수 만들기
	      Connection conn=null;
	      
	      try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      //select 작업을 위해 필요한 객체 참조값 담을 지역변수 미리 만들기
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try {
	    	  //실행할 sql문
	    	  String sql="SELECT num, name, addr FROM member"
	    	  		   +" ORDER BY num ASC"; /*새로운 줄에선 무조건 한칸 띄워라*/
	    	  //PreparedStatement 객체의 참조값 얻어오기
	    	  //peparedStatement는 쿼리문을 돌려주는 친구.
	    	  pstmt=conn.prepareStatement(sql);
	    	  //PreparedStatement 객체를 이용해 query문 수행하고 결과를 
	    	  //resultSet 객체로 받아오기.
	    	  rs=pstmt.executeQuery(); //쿼리문을 돌려주는 예약어. 중요.
	    	  /*
	    	   *  ResultSet 객체의 .next() 메소드는 cursor 밑에 row가 존재하는지 확인해서
	    	   *  만일 존재하면 true를 리턴하고 cursor가 한 칸 밑으로 이동한다
	    	   *  만일 존재하지 않으면 false를 리턴한다.
	    	   */
	    	  while(rs.next()) { //next로 커서를 내린다. 더이상 row 가 없으면 false 를 반환
	    		  //현재 cursor 가 위치한 곳에서 num 이라는 컬럼의 정수 얻어내기
	    		  int num=rs.getInt("num");
	    		  //현재 cursor 가 위치한 곳에서 name 이라는 컬럼의 문자열 얻어내기
	    		  String name=rs.getString("name");
	    		  //현재 cursor 가 위치한 곳에서 addr 이라는 컬럼의 문자열 얻어내기
	    		  String addr=rs.getString("addr");
	    		  //콘솔창에 출력하기
	    		  System.out.println(num+" | "+name+" | "+addr);
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	      System.out.println("메소드 종료");
	}
}

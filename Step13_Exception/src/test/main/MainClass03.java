package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�.");
		
		try {
			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) { //�ݵ�� try-catch�� ������� ���� ����
			e.printStackTrace();
		}
		
		System.out.println("main �޼ҵ尡 ����˴ϴ�.");

	}
}

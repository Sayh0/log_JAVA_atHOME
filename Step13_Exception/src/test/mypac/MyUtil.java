package test.mypac;

public class MyUtil {
	
	public static void draw() {
		System.out.println("5�ʵ��� �׸��� �׷���.");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("�׸� �ϼ�.");
	}
	//�޼ҵ� �ȿ��� �߻��ϴ� Exception�� ���������� ���
	//�޼ҵ带 ȣ���ϴ� �ʿ��� �ش� ���� ó���� �ؾ� �Ѵ�.
	public static void send() throws InterruptedException {
		System.out.println("5�ʵ��� ������ �ؿ�.");
		Thread.sleep(5000);
	}
}

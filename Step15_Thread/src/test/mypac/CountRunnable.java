package test.mypac;
/*
 * ���ο� ������ ����� ��� 2
 * 1. Runnable �������̽��� ������ Ŭ���� ����
 * 2. run()�޼ҵ带 ���� �������̵�
 * 3. Thread Ŭ������ ��ü �����ϸ鼭 �ش� Ŭ������ ���� ��ü�� �������� ���ڷ� ����.
 * 4. Thread Ŭ������ ���� ��ü�� start()�޼ҵ� ȣ���ؼ� ������ ����.
 * 
 */
public class CountRunnable implements Runnable {

	@Override
	public void run() {
		//run �޼ҵ� ������ ���ο� �۾� ����.
		  int count=0;
		  while(true) {
		     try {
		        Thread.sleep(1000);
		     } catch (InterruptedException e) {
		        e.printStackTrace();
		     }
		     count++;
		     System.out.println("���� ī��Ʈ:"+count);
		     if(count==10) {
		        break;
		     }
		  }
	}

}

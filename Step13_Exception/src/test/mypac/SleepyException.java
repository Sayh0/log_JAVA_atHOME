package test.mypac;
/*
 * ���α׷��Ӵ� �ʿ信 ���� ���� ��ü�� ������ Ŭ������ ���� ������� ����.
 * �����߿� �߻��ϴ� ���ܸ� �߻���Ű�� ������ RuntimeException �� ��ӹ޾� ����� ��.
 */
public class SleepyException extends RuntimeException {
	//������
	public SleepyException(String msg) {
		
		super(msg); // ���� �޼����� �����ڸ� ���ڷ� ���޹޾� �θ� �����ڿ� ����
		
		// ���޵� ���� �޼����� ���߿� .getMessage()�� ȣ���ϸ� ���ϵ�.
	}

}

package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	/*
	 * �⺻ �����ڵ� �ʿ��ϴٸ� ���� ����
	 * �����ڴ� �������� ����
	 * � ��ü�� �����ϴ� ����� ���������� �� �� �ִٴ� ��.
	 */
	public Member() {}
	
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}

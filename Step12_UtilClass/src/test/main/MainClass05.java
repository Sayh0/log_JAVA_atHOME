package test.main;

import java.util.ArrayList;

public class MainClass05 {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		/*
		 * AttayList�� �⺻������ type�� ������ �� �����Ƿ�
		 * �⺻ ������ type�� �����ϰ� �ʹٸ� Wrapper Class�� Ȱ������.
		 * int > Integer
		 * double > Double
		 * boolean > Boolean ���
		 */
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//Ȯ�� for�� �̿��� ������ ���� ������� �ܼ�â�� ���
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
	}
}

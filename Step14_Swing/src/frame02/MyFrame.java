package frame02;

import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	//constructor
	public MyFrame(String title) {
		super(title); //�θ� �����ڿ� ������ ���� �Ѱ��ֱ�.
		
		//x��ǥ y��ǥ width height ����
		setBounds(100,100,500,500);
		//��� �̷� �޼ҵ带 �� �� ������? : JFrame���� ��ӹ��� ���̶�.
		//��ӹ����� ���������� JFrame ��ü�� ���������, ��ӹ��� MyFrame��ü�� ���������.
		//������� �� ��ü�� �ϳ��� ���������� �����ȴ�.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�������� ���̾ƿ� �Ŵ����� ������� �ʱ� ������ UI�� ������ǥ�� ���� ��ġ
		
		
		JButton btn1=new JButton("��ư1");

		add(btn1);
		
		JButton btn2=new JButton("��ư2");

		add(btn2);
		
		JButton btn3=new JButton("��ư3");

		add(btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("���� ������");
	}
}

package frame01;

import javax.swing.JButton;
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
		setLayout(null);
		
		JButton btn1=new JButton("��ư1");
		btn1.setLocation(10,10);
		btn1.setSize(100,30);
		add(btn1);
		
		JButton btn2=new JButton("��ư2");
		//setLocation(), setSize() �޼ҵ� ��ſ� �ѹ��� ���� ����.
		btn2.setBounds(120,10,100,30);
		add(btn2);
		
		JButton btn3=new JButton("��ư3");
		//setLocation(), setSize() �޼ҵ� ��ſ� �ѹ��� ���� ����.
		btn3.setBounds(230,10,100,30);
		add(btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("���� ������");
	}
}

package Frame03;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	//constructor
	public MyFrame(String title) {
		super(title); //�θ� �����ڿ� ������ ���� �Ѱ��ֱ�.
		
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("����");

		add(sendBtn);
		
		//��ư�� ������ �������� interface ��ü.
		ActionListener listener=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����.");
				JOptionPane.showMessageDialog(MyFrame.this, "����");
			}
		};
		
		sendBtn.addActionListener(listener);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		JFrame f=new MyFrame("���� ������");
		f.setBounds(100,200,400,400);
	}
}

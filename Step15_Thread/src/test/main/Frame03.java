package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountRunnable;
import test.mypac.CountThread;



public class Frame03 extends JFrame implements ActionListener{
   
   //������
   public Frame03() {
      //���̾ƿ� ���� 
      setLayout(new BorderLayout());
      //����� �������� ��ܿ� ��ġ 
      JPanel panel=new JPanel();
      panel.setBackground(Color.YELLOW);
      add(panel, BorderLayout.NORTH);
      //��ư�� ��ο� �߰� �ϰ� 
      JButton countBtn=new JButton("1~10 ���� ����");
      panel.add(countBtn);
      //��ư�� ������ ����ϱ�
      countBtn.addActionListener(this);
   }
   
   public static void main(String[] args) {
      //MyFrame Ŭ������ �̿��ؼ� ��ü �����ϰ� �������� �������� frame �� ��� 
      Frame03 frame=new Frame03();
      //�������� ���� ����
      frame.setTitle("Frame03");
      //�������� ������ �ڵ����� ���μ����� ���� �ǵ��� �Ѵ�.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent arg0) {
	   //new Thread(new CountRunnable().start());
	   
	   Thread t=new Thread(new CountRunnable());
	   t.start();
	  

	   //�Ʒ� ������ �ٷ� �ܼ�â�� ����
	   System.out.println("���ο� �����尡 ���۵Ǿ����ϴ�.");
	  
	   
      
      
   }
}








package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountThread;



public class Frame02 extends JFrame implements ActionListener{
   
   //������
   public Frame02() {
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
      Frame02 frame=new Frame02();
      //�������� ���� ����
      frame.setTitle("Frame02");
      //�������� ������ �ڵ����� ���μ����� ���� �ǵ��� �Ѵ�.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent arg0) {
	   /*
	    *  ������ ��ü�� 1ȸ���̴�.
	    *  �ѹ� run() �޼ҵ尡 return �ϸ� �� ��ü�� �ٽ� ��� �Ұ�.
	    *  ��� �ʵ忡 ������ ��ü�� �غ��ų �� ����. �ѹ��� ���ư�������, �� ������ ����. �����߻�.
	    *  �ʿ��� ������ new �� �� �����.
	    */
	   
	   
	   //CountThread ��ü �����ؼ�
	   CountThread t=new CountThread();
	   //���ο� ������ ���۽�Ű��
	   t.start(); //stat()�޼ҵ�� run()�޼ҵ� ���ϰ� ������� �ٷ� �����ϱ� �빮��
	   
	   //�Ʒ� ������ �ٷ� �ܼ�â�� ����
	   System.out.println("���ο� �����尡 ���۵Ǿ����ϴ�.");
	  
	   
      
      
   }
}









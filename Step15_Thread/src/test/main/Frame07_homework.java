package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import test.mypac.CountRunnable;
import test.mypac.CountThread;

/*
 * 
�������� �ϳ� �����
�����ӿ� ���ڸ� �Է��ϰ� �����ϱ� ��ư ������
������ �ϳ��� �ܼ�â�� ��µǴ� ���α׷���

��, 1�ʿ� 1�پ� ����� �ǵ��� �ϰ�, ����ϴ� �۾��� ���ο� �����忡��.
 * 
 */

public class Frame07_homework extends JFrame implements ActionListener{
   JTextField tf1;
	
   //������
   public Frame07_homework() {
      //���̾ƿ� ���� 
      //�������� ���̾ƿ� ��Ģ �����ϱ� 
      setLayout(new BorderLayout());
      
      //JPanel
      JPanel topPanel=new JPanel();
      topPanel.setBackground(Color.YELLOW);
      //Panel �� ���ʿ� ��ġ�ϱ� 
      add(topPanel, BorderLayout.NORTH);
      
      //JTextField ��ü�� ���鿡�� JPanel �� �߰��ϱ� 
      tf1=new JTextField(10);
      topPanel.add(tf1);
      //��� ��ư ��ü�� ���� JPanel �� �߰��ϱ�
      JButton exeBtn=new JButton("�����ϱ�");
      topPanel.add(exeBtn);


      //��ư�� ������ ����ϱ�
      exeBtn.addActionListener(this);
   }
   
   //���� �޼ҵ�
   public static void main(String[] args) {
      //MyFrame Ŭ������ �̿��ؼ� ��ü �����ϰ� �������� �������� frame �� ��� 
      Frame07_homework frame=new Frame07_homework();
      //�������� ���� ����
      frame.setTitle("Frame03");
      //�������� ������ �ڵ����� ���μ����� ���� �ǵ��� �Ѵ�.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
		   try {
			   new Thread(new Runnable() {
					@Override
					public void run() {
						//�� ������ �۾� ����
						String strNum=tf1.getText();
						//���ڿ� ���ڷ� ����
						int num1=Integer.parseInt(strNum);
						System.out.println(num1);
						for(int i=0;i<9;i++) {
						    System.out.println(num1+" x "+(i+1)+" = "+num1*(i+1)); 
							try {
							        Thread.sleep(1000);
							     } catch (InterruptedException e) {
							        e.printStackTrace();
							     }
						}
					}
					   
				   }).start();
			   
		   } catch(NumberFormatException nfe) {
			   JOptionPane.showMessageDialog(this, "���ڸ� �Է��ϼ���.");
		   }
	
	   
//	   new Thread(()->{
//			   try {
//					//�� ������ �۾� ����
//					String strNum=tf1.getText();
//					//���ڿ� ���ڷ� ����
//					int num1=Integer.parseInt(strNum);
//					System.out.println(num1);
//					for(int i=0;i<9;i++) {
//					    System.out.println(num1+" x "+(i+1)+" = "+num1*(i+1)); 
//						try {
//						        Thread.sleep(1000);
//						     } catch (InterruptedException e) {
//						        e.printStackTrace();
//						     }
//					}
//		   } catch(NumberFormatException nfe) {
//			   JOptionPane.showMessageDialog(this, "���ڸ� �Է��ϼ���.");
//		   }
//	   }).start();
	   
	   

	   System.out.println("���ο� �����尡 ���۵Ǿ����ϴ�.");

   }
}









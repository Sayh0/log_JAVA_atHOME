package frame06;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
   
   //������
   public MyFrame(String title) {
      //�θ�����ڿ� �������� ���� �Ѱ��ֱ� 
      super(title);
      
      setLayout(new FlowLayout());
      
      JButton sendBtn=new JButton("gagg");
      //�����ӿ� ��ư �߰��ϱ� ( FlowLayout �� ������ �޴´� )
      add(sendBtn);
      sendBtn.addActionListener(this);
      
      //���� ��ư�� ���� 
      JButton deleteBtn=new JButton("����");
      //�����ӿ� �߰��ϱ�
      add(deleteBtn);
      
      deleteBtn.addActionListener(this);
      
   }
   
   public static void main(String[] args) {
      
      JFrame f=new MyFrame("���� ������");
      f.setBounds(100, 100, 500, 500);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      f.setVisible(true);
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	   if(e.getActionCommand()=="gagg") {
		      JOptionPane.showMessageDialog(this, "���� �մϴ�.");
	   } else if (e.getActionCommand()=="����") {
		      JOptionPane.showMessageDialog(this, "���� �մϴ�.");
	   }
   }
}











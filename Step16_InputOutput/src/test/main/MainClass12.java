package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass12 {
   public static void main(String[] args) {
      /*
       *  FileReader ��ü�� Ȱ���ؼ�
       *  
       *  c:/acorn202206/myFolder/memo.txt ���Ͽ� �ִ� ��� ���ڸ� 
       *  
       *  �ܼ�â�� ����ϴ� �ڵ带 �ۼ��� ������.
       *  
       *  - hint
       *  1. �ݺ��� ���鼭 �ѱ��� �� �о� ���� �Ѵ�.
       *  2. �ݺ����� ��� ���ƾ� �ϴ��� Ȯ��ġ �ʴ�.
       *  3. �о �ڵ尪�� char type ���� casting �ؾ� ���� 1���� Ȯ�� �Ҽ� �ִ�.
       *  4. �������� �ʰ� �ֿܼ� ����ϴ� ����� System.out.print() �޼ҵ带 Ȱ���ϸ� �ȴ�.
       */
      
      //���ڿ��� ������ ������ ����� ���� File ��ü
      File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
      
      try {
         //���Ͽ��� ���ڿ��� �о���ϼ� �ִ� ��ü ����
         FileReader fr=new FileReader(memoFile);
         //�ݺ��� ���鼭
         while(true) {
            //���� code �ϳ��� �о��. 
            int code=fr.read();
            //���� ���̻� ���� code ���� ������
            if(code == -1) {
               break;//�ݺ��� Ż��
            }
            //�ڵ尪�� ���ڷ� ��ȯ�ؼ� 
            char ch=(char)code;
            //�����ȣ ���� ����ϱ� 
            System.out.print(ch);
         }
         
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
























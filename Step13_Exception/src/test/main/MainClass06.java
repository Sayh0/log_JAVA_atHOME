package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		MyUtil.draw();
		
		try {
			MyUtil.send();
		} catch (InterruptedException e) { //�ʴ� �Ʊ� �ܺη� throw�ؼ� �ҷ����� trycatch�� �ᱹ ����� �Ѵ�.
			e.printStackTrace();
		} 
	}
}

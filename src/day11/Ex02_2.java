package day11;

public class Ex02_2 {
	public static void main(String[] args) {
		int k=100,e=90,m=80;
		Ex02_1 ex =new Ex02_1();
		ex.setKor(k); ex.setEng(e);ex.setMat(m);
		ex.setSum(ex.getKor(),ex.getEng(),ex.getMat());
		
		
	}
}

package day11;

public class Ex01_2 {
	public static void main(String[] args) {
		Ex01 ex= new Ex01();
		Ex01 ext =ex;
		System.out.println("ex: "+ex);
		ex.a=80;
		ext.func1();
		ext.a=40;
		ex.func2();
		System.out.println();
		
		//2
		//ext.sect01();
		
		//3
		ex.func3(43); ext.print2();
		
		//4
		int num=ext.getNum() -20;
		System.out.println("result: "+num);
		
		//5
		Ex01_3 et =new Ex01_3();
		et.sect2();
		
	}
}











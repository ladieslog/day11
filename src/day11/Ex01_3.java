package day11;

import java.util.Scanner;

public class Ex01_3 {
	private int age;
	private String name;
	public void sect2() {
		Scanner input =new Scanner(System.in);
		String name;
		int age;
		System.out.print("�̸� �Է�: "); name= input.next();
		System.out.print("���� �Է�: "); age=input.nextInt();
		setterFun(name, age);
	}
	
	public void setterFun(String name,int age) {
		this.name=name; this.age=age;
	}
	
}

package day11;

import java.util.Scanner;

public class Ex01 {
	public int a =10,b=50;
	public void func1() {
		System.out.println("01 a : "+a);
	}
	public void func2() {
		int a=30;
		System.out.println("02 a : "+a);
		this.func1();
	}
	
	public void sect01() {
		Scanner input =new Scanner(System.in);
		System.out.print("나이 입력 ");
		int a=input.nextInt();
		ageFunc(a);
		print();
	}
	private int age;
	public void ageFunc(int age) {this.age=age-1;}
	public void print() {System.out.println("당신의 나이는 : "+age);}
	
	//3
	private int num;
	private String name;
	public void func3(int num) {
		this.num=num;
	}
	public void ageFun(int num) {
		this.age=num;
	}
	public void nameFun(String name) {
		this.name=name;
	}
	public void print2() {
		System.out.println("num: "+num);
	}
	public int getNum() {
		return num;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
















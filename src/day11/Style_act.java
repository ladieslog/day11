package day11;

import java.util.Scanner;

public class Style_act {
	Scanner pulls =new Scanner(System.in);
	private int  s,count;
	private String dull;
	public void smell() {
		if(this.s<2) {
			System.out.println("Ż�����Դϴ�. Ż���ϰڽ��ϴ�. ");
			this.s++;
		}else {
			System.out.println("Ż�븦 2���̳� �߽��ϴ�. ���̻��� �ȵ˴ϴ�. ");
		}	
	}
	public void duty() {
		System.out.print("�������� ����Դϴ�. ������ �����ϱ�? (y/n): ");
		dull=pulls.next();
		if(dull.equals("y")) {
			System.out.println("�������ű���� �����մϴ�.");
			this.count++;
		}else if(dull.equals("n")) {
			System.out.println("������ ���� �����ϴ�. ");
		}
		System.out.print("������ �� ȸ���� ���ڽ��ϱ�? (y/n): ");
		dull=pulls.next();
		if(dull.equals("y")) {
			System.out.println("���� �� ȸ���� "+this.count+"�� �Դϴ�.");
		}else if(dull.equals("n")) {
			System.out.println("..");
		}
	}
	
	public void dry() {
		System.out.println("�����ϰڽ��ϴ�. ");
	}
}

package day11;

import java.util.Scanner;

public class Landary_act {
	Scanner pulla =new Scanner(System.in);
	private int count=0,button,water;
	public void land_sw() {
		if(this.button==2) {		
				System.out.println("���� Ż���ϰڽ��ϴ�. ");
				this.count++; this.button=4;		
		}else if(this.button==0){
			System.out.println("������ ���� �ʾҽ��ϴ�. �����Ŀ� �����ּ���");
		}else {
			System.out.println("������ �۵����Դϴ�. �Ͻ������� �����Ŀ� �ٽ����ּ���");
		}
	}
	
	public void land_wash() {
		if(this.count==0) {
			if(this.water>=20&&this.water<=60) {
				System.out.println("���� ��Ź�ϰڽ��ϴ�. ");
				this.count++; this.button=2;
			}else if(this.water>60) {
				System.out.println("�������� �ʹ� ���ƿ� �ٽ� �������ּ���");
			}else {
				System.out.println("���� ���� �����մϴ�. ������ �ٽ� �������ּ���");
			}	
		}else {
			System.out.println("�ٸ������� �־� ���� �� ����մϴ�. �ٽü������ּ��� ");
		}
	}
	
	public void waterAc() {
		System.out.print("������ �������ּ��� :");
		this.water=pulla.nextInt();
		System.out.println("������ �����߽��ϴ�. ");
	}
	
	public void land_st() {
		if (this.button==1) {
			System.out.println("�ٽ� ��Ź�մϴ�.");
			this.button=2;
			this.count++;
		}else if(this.button==2) {
			System.out.println("�����߿� �Ͻ������� �����ϼ̽��ϴ�.");
			this.button=1;
		}else if(this.button==3) {
			System.out.println("�ٽ� Ż���մϴ�.");
			this.button=4;this.count++;
		}else if(this.button==4) {
			System.out.println("Ż���߿� �Ͻ������� �����ϼ̽��ϴ�.");
			this.button=3;
		}else if (this.button==0) {
			System.out.println("��Ź�Ⱑ �����Ǿ��ִ� ���¶� �Ͻ������� �ǹ̰� �����ϴ�.");
		}
	}
	
	public void stop() {
		if(this.button>0) {
			System.out.println("���� �۵��ϴ� ���� �����մϴ�. ");
			this.button=0;
		}else if(this.button==0) {
			System.out.println("�̹� ���� �����Դϴ�.");
		}else {
			System.out.println(".....");
		}
	}
	public void cond() {
		System.out.println(this.button);
		System.out.println("�۵��� Ƚ��: "+this.count);
	}
	public int num() {
		return this.button;
	}
}

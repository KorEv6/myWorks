package javapack;

import java.util.Scanner;

// ���� �л����� ������ �������� ������ ��ü �迭 ���ҿ� ���� �־� �л��鸶���� ������ ������ �����ϰ� �л����� ������ ���� ����� ���� ���α׷�
class st{
	int korean = 0;
	int math = 0;
	int eng = 0;
	st(int s1, int s2, int s3){
		this.korean = s1;
		this.math = s2;
		this.eng = s3;
	}
	
}

public class ObjArrayPrac {
	public static void main(String[] args) {
		st[] students = new st[2];
		Scanner sc = new Scanner(System.in);
		int total_k = 0;
		int total_m = 0;
		int total_e = 0;
		for(int i = 0 ; i < 2; i++) {
			students[i] = new st(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		for(int i = 0; i < 2; i++) {
			System.out.printf("�л� %d�� ���� ���� : %d, ���� ���� : %d, ���� ���� : %d\n", i, students[i].korean, students[i].math, students[i].eng);
			total_k += students[i].korean;
			total_m += students[i].math;
			total_e += students[i].eng;
		}
		
		System.out.printf("�л����� ���� ��� ���� : %d, ���� ��� ���� : %d, ���� ��� ���� : %d ", total_k / 2, total_m/2, total_e/2);
		
	}
}

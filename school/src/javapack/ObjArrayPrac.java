package javapack;

import java.util.Scanner;

// 여러 학생들의 국영수 점수들을 각각의 객체 배열 원소에 집어 넣어 학생들마다의 국영수 점수를 보관하고 학생들의 점수를 더해 평균을 내는 프로그램
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
			System.out.printf("학생 %d의 국어 점수 : %d, 수학 점수 : %d, 영어 점수 : %d\n", i, students[i].korean, students[i].math, students[i].eng);
			total_k += students[i].korean;
			total_m += students[i].math;
			total_e += students[i].eng;
		}
		
		System.out.printf("학생들의 국어 평균 점수 : %d, 수학 평균 점수 : %d, 영어 평균 점수 : %d ", total_k / 2, total_m/2, total_e/2);
		
	}
}

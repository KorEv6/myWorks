package javapack;

import java.util.Scanner;

class Lecture {
	private String name;
	private int division;
	private String professor;
	private String room;
	private int count = 0;
	Student[] students = new Student[100];

	Lecture(String name, int division, String professor, String room) {
		this.name = name;
		this.division = division;
		this.professor = professor;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public int getDivision() {
		return division;
	}

	public String getProfessor() {
		return name;
	}

	public String getRoom() {
		return room;
	}

	public void addStudent(Student s) {
		students[count] = s;
		count++;
	}

	public Student getStudent(int i) {
		return students[i];
	}

	public Student getStudent(int type, String x) {
		if (type == 0) {
			for (int i = 0; i < students.length; i++) {
				if (students[i].getName().equals(x)) {
					return students[i];
				}
			}
		} else if (type == 1) {
			for (int i = 0; i < students.length; i++) {
				if (students[i].id.equals(x)) {
					return students[i];
				}
			}
		}

		return null;
	}

}

public class LectureClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lecture lc = new Lecture(sc.next(), sc.nextInt(), sc.next(), sc.next());
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			lc.students[i] = new Student(sc.next(), sc.next()); // 0번째 원소에 이름과 학번 저장
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				lc.students[i].addMileage(sc.nextInt()); // 0번째 원소에 마일리지 저장
			}

		}
			String str = sc.nextLine();
		while (true) {
			str = sc.nextLine();
			if (str.equals("")) {
				break;
			} else if (str.length() == 1) {
				lc.getStudent(Integer.parseInt(str)).isPass();
			} else {
				lc.getStudent(Integer.parseInt(str.substring(0, 1)), str.substring(2)).isPass();

			}

		}

	}
}



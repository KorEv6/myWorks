package javapack;

class Student {
	public String name;
	public String id;
	public int mileage;
	static int count;

	Student(String name, String id) {
		this.name = name;
		this.id = id;
		count++;
	}

	String getName() {
		return name;
	}

	String getId() {
		return id;
	}

	int getMileage() {
		return mileage;
	}

	void addMileage(int value) {
		this.mileage += value;
	}

	boolean isPass() {
		if (mileage >= 500) {
			System.out.printf("%s(%s): %d->PASS\n", name, id, mileage);
			return true;
		} else {
			System.out.printf("%s(%s): %d->FAIL\n", name, id, mileage);
			return false;
		}
	}

	static int getStudentCount() {
		return count;
	}
}

public class StudentM {
	public static void main(String[] args) {
		System.out.println("das");
	}

}

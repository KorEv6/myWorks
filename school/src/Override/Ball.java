package Override;

public class Ball extends Circle {
	private String color;
	
	public Ball(String str) {
		this.color = str;
	}
	
	public void findColor() {
		System.out.println(color + " ���̴�.");
	}
	
	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(���� * ������ * ������)�̴�.");
	}
	
	@Override
	public void findArea() {
		System.out.println("���̴� 4*(����*������*�������̴�)");
	}
}

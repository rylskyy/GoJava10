package module2;

public class Triangle extends Shape {
	Triangle() {
		super.setName("�����������");
	}

	public static void area(double[] side) {
		double x = Triangle.perimeter(side) / 2;
		double y = Math.sqrt(x * (x - side[0]) * (x - side[1]) * (x - side[2]));
		System.out.println("������� " + getName() + "�" + " ����� : " + y + " ��.��\n");
	}
}

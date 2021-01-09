package module2;

import java.util.Scanner;

public class Main {


	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		// ������� 1
		// �������� ��������� ������� ��������� 2 ������� ����� � �������.
		// ������� ��� ����� A � B.
		// ��������� ������ ������� ��� ����� � ������� ��������� � �������:
		// A + B = X (��� ����� ������ ���� �������� �� �����).

		System.out.println("�����������.\n������� ��� ������� �����");
		Shape.setHeight(scan.nextDouble());
		Shape.setWidth(scan.nextDouble());
		Shape.sum(Shape.getHeight(), Shape.getWidth());

		// ������� 2
		// ��������� ��������� �� ���� 2 ����� - ������ � ������ ��������������.
		// ���������� ������� � ������� ������� ��������������

		System.out.println("������� ������ �������������� ");
		Rectangle.setWidth(scan.nextDouble());
		System.out.println("������� ������ �������������� ");
		Rectangle.setHeight(scan.nextDouble());
		new Rectangle().area(Rectangle.getHeight(), Rectangle.getWidth());

		// ������� 3
		// ��������� ��������� �� ���� 3 ����� - ����� ������ ������������.
		// ���������� ������� � ������� ������� ������������

		double[] triangle = new Triangle().sides();
		new Triangle().area(triangle);

		// ������� 4
		// ���� 2 ����� - A � B.
		// ������� � �������:
		// ����� �� ��� ����� ����� ����� (true / false)
		// �������� �� A �� B ��� ������� (true / false)
		// A ������ ��� B (true / false)

		Numbers n = new Numbers();
		System.out.println("A ����� � : " + (n.num.get(0) == n.num.get(1)));
		System.out.println("� �������� ��� ������� �� � : " + ((n.num.get(0) % n.num.get(1)) == 0));
		System.out.println("A ������ � : " + (n.num.get(0) > n.num.get(1)));

		// ������� 5
		// ���� 3 ����� - A, B, C
		// ������� � �������:
		// �������� �� A ���������� ������ (true / false)
		// �������� �� B ���������� ������ (true / false)
		// �������� �� C ���������� ������ (true / false)
		//
		// �������� �� A ���������� ������ (true / false)
		// �������� �� B ���������� ������ (true / false)
		// �������� �� C ���������� ������ (true / false)
		//
		// �������� �� A ������������� ������ ����� B � C (true / false)
		// �������� �� B ������������� ������ ����� A � C (true / false)
		// �������� �� C ������������� ������ ����� A � B (true / false)

		n = new Numbers();
		System.out.println(
				"�������� �� A ���������� ������ : " + (n.num.get(1) < n.num.get(0) & n.num.get(2) < n.num.get(0)));
		System.out.println(
				"�������� �� A ���������� ������ : " + (n.num.get(0) < n.num.get(1) & n.num.get(2) < n.num.get(1)));
		System.out.println(
				"�������� �� A ���������� ������ : " + (n.num.get(1) < n.num.get(2) & n.num.get(2) > n.num.get(0)));
	}

}

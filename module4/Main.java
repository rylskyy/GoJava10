package module4;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);;
	private static final String VALUE = "������� ����� \n";
	private static int x;
	private static int y;
	private static int k;

	private static void inOne() {
		System.out.print(VALUE);
		x = scan.nextInt();
	}

	private static void inTwo() {
		System.out.print(VALUE);
		x = scan.nextInt();
		System.out.print(VALUE);
		y = scan.nextInt();
	}

	private static void count() {
		inOne();
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}
	}

	private static void drawRectangle() {
		inTwo();
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("+ ");
			}
			System.out.print("\n");
		}
	}

	private static void drawRectangleOne() {
		inOne();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("+ ");
			}
			System.out.print("\n");
		}
	}

	private static int getMax(int x, int y) {
		if (x > y)
			return x;
		return y;
	}

	private static float getMax(float x, float y) {
		if (x > y)
			return x;
		return y;
	}

	private static void rec(int x) {
		if (x > 1) {
			rec(x - 1);
		}
		System.out.println(x);
	}

	private static void cross(int x) {
		if (x > 0) {
			cross(x - 1);
			System.out.println("+");
		}
	}

	public static void main(String[] args) {
		// ������� 1
		// �������� ������� ������� ������� � ������� �� ����� �.
		// ��������� �������: ����� �
		//
		// �������� � = 5.
		// ����� ���������:
		// 1
		// 2
		// 3
		// 4
		// 5

		// count();

		// ������� 2
		// �������� ������� drawRectangle ������� ������ � ������� �������������
		// �� �������� '+'
		// ��������� �������: ������ �������������� � ��������, ������
		// �������������� � ��������
		//
		// �������� 3 �� 2
		// ����� ���������:
		// + + +
		// + + +

		// drawRectangle();

		// ������� 3
		//
		// ����������� ������� drawRectangle (������� 2) ����� �������, �����
		// ��� ����� ��������� �� ���� ������ 1 �������� (������ ��������) �
		// �������� ������� � ������� ���������
		//
		// �������� 2
		// ����� ���������:
		// + +
		// + +
		//
		// �������� 3
		// ����� ���������:
		// + + +
		// + + +
		// + + +

		// drawRectangleOne();

		// ������� 4
		// �������� ������� getMax ������� ��������� �� ����
		// ��� ��������� � ���� �����.
		// � ���������� ������������ �� ���� ����.
		// �����, ���������� ����������� ��� �������
		// ��� ������ � ������� ��������� ������ ���������� (int, float)

		// System.out.print(getMax(10, 55));

		// ������� 5
		// ������ ������ 1, ��� ������������� ������. ��������� ��������.

		//rec(5);
		
		cross(5);
	}

}

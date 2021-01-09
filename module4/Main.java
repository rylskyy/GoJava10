package module4;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);;
	private static final String VALUE = "Введите число \n";
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
		// Задание 1
		// Написать функцию которая считает в консоли до числа Х.
		// Аргументы функции: число Х
		//
		// Например Х = 5.
		// Вывод программы:
		// 1
		// 2
		// 3
		// 4
		// 5

		// count();

		// Задание 2
		// Написать функцию drawRectangle которая рисует в консоли прямоугольник
		// из символов '+'
		// Аргументы функции: ширина прямоугольника в символах, высота
		// прямоугольника в символах
		//
		// Например 3 на 2
		// Вывод программы:
		// + + +
		// + + +

		// drawRectangle();

		// Задание 3
		//
		// Перегрузить функцию drawRectangle (задание 2) таким образом, чтобы
		// она могла принимать на вход только 1 параметр (ширина квадрата) и
		// рисовать квадрат с равными сторонами
		//
		// Например 2
		// Вывод программы:
		// + +
		// + +
		//
		// Например 3
		// Вывод программы:
		// + + +
		// + + +
		// + + +

		// drawRectangleOne();

		// Задание 4
		// Написать функцию getMax которая принимает на вход
		// два аргумента в виде чисел.
		// А возвращает максимальное из этих двух.
		// Также, необходимо перегрузить эту функцию
		// для работы с разными числовыми типами переменных (int, float)

		// System.out.print(getMax(10, 55));

		// Задание 5
		// Решить задачу 1, без использования циклов. Используя рекурсию.

		//rec(5);
		
		cross(5);
	}

}

package module2;

import java.util.Scanner;

public class Main {


	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		// Задание 1
		// Написать программу которая считывает 2 дробных числа с консоли.
		// Назовем эти числа A и B.
		// Программа должна сложить два числа и вывести результат в формате:
		// A + B = X (все буквы должны быть заменены на числа).

		System.out.println("Здраствуйте.\nВведите два дробных числа");
		Shape.setHeight(scan.nextDouble());
		Shape.setWidth(scan.nextDouble());
		Shape.sum(Shape.getHeight(), Shape.getWidth());

		// Задание 2
		// Программа принимает на вход 2 числа - ширина и высота прямоугольника.
		// Необходимо вывести в консоль площадь прямоугольника

		System.out.println("Введите высоту прямоугольника ");
		Rectangle.setWidth(scan.nextDouble());
		System.out.println("Введите ширину прямоугольника ");
		Rectangle.setHeight(scan.nextDouble());
		new Rectangle().area(Rectangle.getHeight(), Rectangle.getWidth());

		// Задание 3
		// Программа принимает на вход 3 числа - длины сторон треугольника.
		// Необходимо вывести в консоль площадь треугольника

		double[] triangle = new Triangle().sides();
		new Triangle().area(triangle);

		// Задание 4
		// Дано 2 числа - A и B.
		// Вывести в консоль:
		// равны ли эти числа между собой (true / false)
		// делиться ли A на B без остатка (true / false)
		// A больше чем B (true / false)

		Numbers n = new Numbers();
		System.out.println("A равно В : " + (n.num.get(0) == n.num.get(1)));
		System.out.println("А делиться без остатка на В : " + ((n.num.get(0) % n.num.get(1)) == 0));
		System.out.println("A больше В : " + (n.num.get(0) > n.num.get(1)));

		// Задание 5
		// Дано 3 числа - A, B, C
		// Вывести в консоль:
		// является ли A наибольшим числом (true / false)
		// является ли B наибольшим числом (true / false)
		// является ли C наибольшим числом (true / false)
		//
		// является ли A наименьшим числом (true / false)
		// является ли B наименьшим числом (true / false)
		// является ли C наименьшим числом (true / false)
		//
		// является ли A промежуточным числом между B и C (true / false)
		// является ли B промежуточным числом между A и C (true / false)
		// является ли C промежуточным числом между A и B (true / false)

		n = new Numbers();
		System.out.println(
				"Является ли A наибольшим числом : " + (n.num.get(1) < n.num.get(0) & n.num.get(2) < n.num.get(0)));
		System.out.println(
				"Является ли A наибольшим числом : " + (n.num.get(0) < n.num.get(1) & n.num.get(2) < n.num.get(1)));
		System.out.println(
				"Является ли A наибольшим числом : " + (n.num.get(1) < n.num.get(2) & n.num.get(2) > n.num.get(0)));
	}

}

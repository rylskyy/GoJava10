package module2;

import java.util.Scanner;

public class Shape {
	private static double height;

	public static double getHeight() {
		return height;
	}

	public static void setHeight(double height) {
		Shape.height = height;
	}

	public static double getWidth() {
		return width;
	}

	public static void setWidth(double width) {
		Shape.width = width;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Shape.name = name;
	}

	private static double width;
	private static String name;

	public static void sum(double height, double width) {

		double sum = height + width;
		System.out.println(height + " + " + width + " = " + sum);
	}

	public static void area(double d, double e) {
		System.out.println("ѕлощадь " + name + "а" + " равна : " + d * e + " мм.кв\n");
	}

	public static double perimeter(double[] per) {
		double i = 0;
		for (double d : per) {
			i += d;
		}
		return i;
	}

	public static double[] sides() {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите количество сторон ");
		double[] x = new double[scan.nextInt()];
		for (int i = 0; i < x.length; i++) {
			System.out.println("¬ведите длину стороны " + name + "а");
			x[i] = scan.nextDouble();
		}
		
		return x;
	}
	
}

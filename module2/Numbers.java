package module2;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
	ArrayList<Double> num = new ArrayList<Double>();

	@SuppressWarnings({ "resource" })
	public Numbers() {

		// TODO Auto-generated constructor stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число\n После оканчания введите 'n' ");
		do {
			num.add(scan.nextDouble());
			System.out.println("Введите число");
		} while (true == scan.hasNextDouble());

	}

}

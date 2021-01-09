package module3;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Arrays {
	private static int[] ini;
	private static int[] iniTwo;
	private static int[] sum;
	private static String[] split;
	private static int iniSize;
	private static String iniArray;
	private static int min = Integer.MAX_VALUE;
	private static int max = Integer.MIN_VALUE;
	static final String INTMASS = "Введите массив ";
	static final String INISIZE = "Введите размер массива ";
	static Pattern pat = Pattern.compile(",");

	public static int[] getIni() {
		return ini;
	}

	public static void setIni(int[] ini) {
		Arrays.ini = ini;
	}

	public static int[] initiation() {
		split = pat.split(iniArray());
		ini = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			for (int x = 0; x < ini.length; x++) {
				ini[i] = Integer.parseInt(split[i]);
			}
		}
		return getIni();
	}

	public static void reverse() {
		split = new String[iniSize];
		split = pat.split(iniArray());
		for (int j = split.length - 1; j >= 0; j--) {
			System.out.print(split[j]);
			if (j != 0)
				System.out.print(",");
		}
	}

	public static void min(int[] arr) {
		for (int i : arr) {
			min = Math.min(min, i);
		}
		System.out.println("Mинимальное число в массиве  " + min);
	}

	public static void max(int[] arr) {
		for (int i : arr) {
			max = Math.max(max, i);
		}
		System.out.println("Mаксимальное число в массиве  " + max);
	}

	public static void count(int i, int[] arr) {

		int count = 0;
		for (int j : arr) {
			if (j == i)
				count++;
		}
		System.out.println("Количество повторений числа " + i + " равно " + count);
	}

	public static int[] sort(int[] arr) {

		boolean isSort = false;
		int buf;
		while (!isSort) {
			isSort = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					isSort = false;

					buf = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = buf;

				}
			}
		}
		return getIni();
	}

	public static int[] reSort(int[] arr) {

		boolean isSort = false;
		int buf;
		while (!isSort) {
			isSort = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					isSort = false;

					buf = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = buf;

				}
			} 
		}
		return arr;
	}

	public static void show(int[][] arr) {
		for (int[] i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void repeatMax(int[] arr) {
		int count = 1;
		int buf = 0;
		sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else if (count > buf) {
				buf = count;

			} else
				count = 1;
		}
		System.out.println("Максимальное количествово повторений " + (buf != 1 ? buf : 0));
	}

	public static void repeatMin(int[] arr) {
		int count = 1;
		int buf = 0;
		boolean lock = true;
		sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else if (lock & count > 1) {
				lock = false;
				buf = count;
				count = 1;
			} else if (buf > count & count != 1) {
				buf = count;
				count = 1;
			} else
				count = 1;
		}
		System.out.println("Минимальное количествово повторений " + buf);
	}

	public static int iniSize() {
		Scanner scan = new Scanner(System.in);
		System.out.println(INISIZE);
		iniSize = scan.nextInt();
		return iniSize;

	}

	public static String iniArray() {
		Scanner scan = new Scanner(System.in);
		System.out.print(INTMASS + "\n");
		iniArray = scan.next();
		return iniArray;
	}

	public static int[] iniTwo() {
		int[] ini = new int[iniSize()];
		split = pat.split(iniArray());
		for (int i = 0; i < ini.length; i++) {
			ini[i] = Integer.parseInt(split[i]);
		}

		return ini;
	}

	public static int[] sum(int[] one, int[] two) {
		if (one.length > two.length) {
			sum = new int[one.length];
			for (int i = 0; i < two.length; i++) {
				one[i] += two[i];
				sum[i] = one[i];
			}

		} else
			sum = new int[two.length];
		for (int j = 0; j < one.length; j++) {
			two[j] += one[j];
			sum[j] = two[j];
		}
		return sum;
	}

	public static int[] getSum() {
		return sum;
	}

	public static void setSum(int[] sum) {
		Arrays.sum = sum;
	}

	public static int[] getIniTwo() {
		return iniTwo;
	}

	public static void setIniTwo(int[] iniTwo) {
		Arrays.iniTwo = iniTwo;
	}
}

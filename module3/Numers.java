package module3;

import java.util.Arrays.*;
import java.util.Scanner;

public class Numers {
	static final String INNUM = "¬ведите число";
	private static String a;
	private static String b;
	private static int width;
	private static int height;
	private static char[] num;

	public static String getA() {
		return a;
	}

	public static void setA(String a) {
		Numers.a = a;
	}

	public static String getB() {
		return b;
	}

	public static void setB(String b) {
		Numers.b = b;
	}

	public static int getWidth() {
		return width;
	}

	public static void setWidth(int width) {
		Numers.width = width;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		Numers.height = height;
	}

	public static char[] getNum() {
		return num;
	}

	public static void setNum(char[] num) {
		Numers.num = num;
	}

	public static void reversal(String i) {

		num = i.toCharArray();

		for (int j = num.length - 1; j >= 0; j--) {
			System.out.print(num[j]);
		}
		System.out.print(" ");
	}

	public static void initiation() {

		Scanner scan = new Scanner(System.in);
		System.out.println(INNUM);
		a = scan.next();
		System.out.println(INNUM);
		b = scan.next();
	}

	public static void iniRectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println(INNUM);
		width = scan.nextInt();
		System.out.println(INNUM);
		height = scan.nextInt();
	}

	public static void rectangleCrosses(int width, int height) {
	for (int j = 0; j < height; j++) {
			System.out.println();
			for (int i = 0; i < width; i++) {
				System.out.print("+");
			}
		}	
	}
	
	
	public static void show (int [][] hum){
		for (int i = 0; i < hum.length; i++) {
			for (int j = 0; j < hum[i].length; j++) {
				System.out.print(hum [i][j]+" ");
			}System.out.println(" ");
		}
	}
	
public static int [][]  hundred(int width,int height ){
	int x = -100;
	int y = 1000;
	int [][] hun = new int [width][height];
	  for (int i = 0; i < width; i++) {
		  for (int j = 0; j < height; j++) {
			if( i == 0||i == width-1||j == 0||j == height-1){
				hun[i][j]= x;
			}else hun[i][j]= y++;
		}
		  }
	  
	return hun;
		
	}
}

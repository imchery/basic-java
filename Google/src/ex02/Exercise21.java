package ex02;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width, height = 0, area = 0, perimeter = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("가로의 길이는?(단위: m): ");
		double widthLength = scanner.nextDouble();
		System.out.print("세로의 길이는?(단위: m): ");
		double heightLength = scanner.nextDouble();

		area = widthLength * heightLength;
		perimeter = (widthLength + heightLength) * 2;

		System.out.println("직사각형의 넓이: " + area);
		System.out.println("직사각형의 둘레: " + perimeter);

	}

}

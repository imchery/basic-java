package ex02;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		double radius = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double height = scanner.nextDouble();

		double area = (double) (2 * (Math.PI * radius * 2));
		double volume = area * height;

		System.out.println("원기둥 밑변의 넓이는 " + area + "㎠이고, 원기둥의 부피는 " + volume + "㎠이다.");

	}

}

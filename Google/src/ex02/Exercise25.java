package ex02;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원짜리 동전의 갯수: ");
		int coin500 = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		int coin100 = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		int coin50 = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		int coin10 = scanner.nextInt();

		int totalsum = coin500 * 500 + coin100 * 100 + coin50 * 50 + coin10 * 10;
		System.out.println("저금통 안의 동전의 총 액수: " + totalsum);
	}

}

package ex05;

public class Exercise05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] scores = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] < min) {
				min = scores[i];
			}
		}

		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}

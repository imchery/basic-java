package ex02;

public class Exercise22 {
	public static void main(String[] args) {

		double distance = 40e12;
		double lightSpeed = 300000;

		double dividSec = distance / lightSpeed;

		double dividMin = dividSec / 60;
		double dividHour = dividMin / 60;
		double dividDay = dividHour / 60;
		double dividYear = dividDay / 60;

		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + dividYear + "광년이다.");
	}

}

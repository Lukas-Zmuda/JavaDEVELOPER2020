import java.util.Scanner;

public class U4BMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//vypocitat a vypisat hodnotu BMI
		System.out.println("--- Program na vypocet BMI ---");
		System.out.println("Zadaj vysku[cm]: ");
		int vyska = sc.nextInt(); //cm
		System.out.println("Zadaj hmotnost[kg]: ");
		int hmotnost = sc.nextInt(); //kg

		double v = vyska / 100.0;
		double bmi = hmotnost / (v * v);
		
		System.out.println("Hmotnost: " + hmotnost + " kg");
		System.out.println("Vyska: " + vyska + " cm");
		System.out.println("BMI = " + bmi);		
	}
}
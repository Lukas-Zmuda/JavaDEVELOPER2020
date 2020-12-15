import java.util.Scanner;

public class U4BMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//vypocitat a vypisat hodnotu BMI
		System.out.println("--- Program na vypocet BMI ---");
		System.out.println("Zadaj vysku[cm]: ");
		int vyska = sc.nextInt(); //cm
		if(!((vyska > 40) && (vyska < 280))) {
			System.out.println("Nespravna vyska! Spusti program este raz.");
			System.exit(0);
		}
		System.out.println("Zadaj hmotnost[kg]: ");
		int hmotnost = sc.nextInt(); //kg
		if(!((hmotnost > 10) && (hmotnost < 650))) {
			System.out.println("Nespravna hmotnost! Spusti program este raz.");
			System.exit(0);
		}
		double v = vyska / 100.0;
		double bmi = hmotnost / (v * v);
		
		System.out.println("Hmotnost: " + hmotnost + " kg");
		System.out.println("Vyska: " + vyska + " cm");
		System.out.println("BMI = " + bmi);	
		if(bmi < 17.5) {
			System.out.println("Podvyziva");
		}
		if((bmi >= 17.5) && (bmi < 25)) {
			System.out.println("Idealna a zdrava vaha");
		}
		if((bmi >= 25) && (bmi < 30)) {
			System.out.println("Mierna nadvaha");
		}
		if((bmi >= 30) && (bmi < 40)) {
			System.out.println("Obezita");
		}
		if(bmi > 40) {
			System.out.println("Tazka obezita");
		}
		
	}
}
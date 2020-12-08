
public class U4BMI {

	public static void main(String[] args) {

		//vypocitat a vypisat hodnotu BMI
		int vyska = 186; //cm
		int hmotnost = 86; //kg

		double v = vyska / 100.0;
		double bmi = hmotnost / (v * v);
		
		System.out.println("Hmotnost: " + hmotnost + " kg");
		System.out.println("Vyska: " + vyska + " cm");
		System.out.println("BMI = " + bmi);		
	}
}
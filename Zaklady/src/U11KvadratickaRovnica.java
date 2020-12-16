import java.util.Scanner;

public class U11KvadratickaRovnica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		double diskr = 0, x1 = 0, x2 = 0, x = 0;
		System.out.println("----Program na vypocet korenov kvadratickej rovnice----");
		System.out.println("Zadaj a:");
		a = sc.nextInt();
		System.out.println("Zadaj b: ");
		b = sc.nextInt();
		System.out.println("Zadaj c:");
		c = sc.nextInt();
		
		System.out.println(a + "x^2" + ((b > 0)?"+" + b: b) +"x" + ((c > 0)?"+" + c: c) + " = 0");
		diskr = b * b - (4 * a * c);
		if(diskr > 0) {
			x1 = (-b + Math.sqrt(diskr))/(2 * a);
			x2 = (-b - Math.sqrt(diskr))/(2 * a);
			System.out.println("Rovnica ma dva korene:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}else if(diskr == 0) {
			x = (-b)/(2 * a);
			System.out.println("Rovnica ma jeden koren:");
			System.out.println("x = " + x);
		}else {
			System.out.println("Rovnica nema riesenie v R");
		}
		

	}

}

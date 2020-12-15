import java.util.Scanner;

public class U6MaxTrochCisel {

	public static void main(String[] args) {
		//vstup
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		System.out.println("Zadaj a:");
		a = sc.nextInt();
		System.out.println("Zadaj b:");
		b = sc.nextInt();
		System.out.println("Zadaj c:");
		c = sc.nextInt();
		
		//vetvenie 1
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		//vetvenie 2
		if(c > max) {
			max = c;
		}
		//vystup
		System.out.println("max: " + max);

	}

}

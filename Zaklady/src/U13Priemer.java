import java.util.Scanner;

public class U13Priemer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Program na vypocet aritmetickeho priemeru----");
		int pocet = 0;
		double cislo = 0, suma = 0;
		
		System.out.println("Zadaj pocet cisel: ");
		pocet = sc.nextInt();
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextDouble();
			suma += cislo;
		}
		System.out.println("Aritmeticky priemer: " + (suma / pocet));

	}

}

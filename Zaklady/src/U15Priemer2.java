import java.util.Scanner;

public class U15Priemer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Program na vypocet aritmetickeho priemeru----");
		int pocet = 0;
		double cislo = -1, suma = 0;
		
		while(cislo != 0) {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextDouble();
			suma += cislo;
			pocet++;
		}
		pocet--;
		System.out.println("Aritmeticky priemer: " + (suma / pocet));

	}

}

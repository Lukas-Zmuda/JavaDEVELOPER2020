import java.util.Scanner;

public class U5Sprepitne {

	public static void main(String[] args) {
		// program na vypocet sprepitneho v restauracii
		// Vstup: suma k zaplateniu, sprepitne (napr. 24 %)
		// Vystup: suma sprepitneho, celkova suma

		double suma = 0, sumaSprepitne = 0, celkovaSuma = 0;
		int sprepitne;
		int pokracovat = 1;

		// nacitanie vstupu
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Zadaj sumu: ");
			suma = sc.nextDouble();
			if (suma < 0) {
				System.out.println("Nespravna suma! Spusti program este raz.");
				System.exit(0);
			}
			System.out.println("Zadaj vysku sprepitneho[v %]:");
			sprepitne = sc.nextInt();
			if (sprepitne > 100) {
				System.out.println("Zle sprepitne! Spusti program este raz.");
				System.exit(0);
			}
			// vypocet sprepitneho
			sumaSprepitne = suma * (sprepitne / 100.0);

			// vypocet celkovej sumy
			celkovaSuma = suma + sumaSprepitne;
			// vystup hodnot sprepitneho a celkovej sumy
			System.out.println("-----");
			System.out.println("Suma: " + suma);
			System.out.println("Sprepitne " + sprepitne + "%: " + sumaSprepitne);
			System.out.println("Celkovo k zaplateniu: " + celkovaSuma);
			System.out.println("Chcete pokracovat? 1 - ano, 0 - nie");
			pokracovat = sc.nextInt();
		} while (pokracovat == 1);
		System.out.println("Dakujeme za pouzitie nasej mocnej apky.");
	}
}
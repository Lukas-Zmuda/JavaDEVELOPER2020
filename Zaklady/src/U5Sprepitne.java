import java.util.Scanner;

public class U5Sprepitne {

	public static void main(String[] args) {
		// program na vypocet sprepitneho v restauracii
		//Vstup: suma k zaplateniu, sprepitne (napr. 24 %)
		//Vystup: suma sprepitneho, celkova suma
		
		double suma = 0, sumaSprepitne = 0, celkovaSuma = 0;
		int sprepitne;
		
		//nacitanie vstupu
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj sumu: ");
		suma = sc.nextDouble();
		System.out.println("Zadaj vysku sprepitneho[v %]:");
		sprepitne = sc.nextInt();
		
		//vypocet sprepitneho
		sumaSprepitne = suma * (sprepitne / 100.0);
		
		//vypocet celkovej sumy
		celkovaSuma = suma + sumaSprepitne;
		//vystup hodnot sprepitneho a celkovej sumy
		System.out.println("-----");
		System.out.println("Suma: " + suma);
		System.out.println("Sprepitne " + sprepitne + "%: " + sumaSprepitne);
		System.out.println("Celkovo k zaplateniu: " + celkovaSuma);

	}

}

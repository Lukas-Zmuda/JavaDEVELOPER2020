import java.util.Scanner;

public class U3EuroSvk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//konverter EUR -> SVK
		System.out.println("--- Konverter EUR -> Sk ---");
		System.out.println("Zadaj sumu[EUR]: ");
		double sumaEuro = sc.nextDouble();
		
		double sumaSvk = sumaEuro * 30.126;
		
		System.out.println(sumaEuro + " EUR = " + sumaSvk + " Sk");

	}

}

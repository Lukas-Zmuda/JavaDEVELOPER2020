import java.util.Scanner;

public class VstupScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadaj meno: ");
		String meno = "";
		meno = sc.nextLine();
		System.out.println("Ahoj " + meno + "!");
		int rok = 0;
		System.out.println("V ktorom roku si sa narodil?");
		rok = sc.nextInt();
		System.out.println("Mas " + (2020 - rok) + " rokov.");
	}
}
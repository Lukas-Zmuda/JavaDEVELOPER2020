import java.util.Scanner;

public class U9PriestupnyRok {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rok = 0;
		System.out.println("Zadaj rok:");
		rok = sc.nextInt();
		if((rok % 4 == 0 && rok % 100 != 0)||(rok % 400 == 0)) {
			System.out.println("Rok " + rok + " je priestupny");
		}else {
			System.out.println("Rok " + rok + " je nepriestupny");
		}
	}
}
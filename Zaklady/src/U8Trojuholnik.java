import java.util.Scanner;

public class U8Trojuholnik {

	public static void main(String[] args) {
		//Program na vstupe nacita strany trojuholnika
		//nasledne vypise, ci sa da zostrojit. V pripade, ze ano, vypise o aky trojuholnik sa jedna
		//napr. rovnostranny, rovnoramenny, roznostranny
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		System.out.println("----Program trojuholnik----");
		System.out.println("Zadaj a:");
		a = sc.nextInt();
		System.out.println("Zadaj b:");
		b = sc.nextInt();
		System.out.println("Zadaj c:");
		c = sc.nextInt();
		
		if((a + b > c)&&(a + c > b) && (b + c > a)) {
			System.out.println("Trojuholnik sa da zostrojit");
			if((a == b)&&(b == c)) {
				System.out.println("Trojuholnik je rovnostranny");
			}else if((a == b) || (b == c) || (a == c)) {
				System.out.println("Trojuholnik je rovnoramenny");
			}else {
				System.out.println("Trojuholnik je roznostranny");
			}
		}else {
			System.out.println("Trojuholnik sa neda zostrojit");
		}
		

	}

}

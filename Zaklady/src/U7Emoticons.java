import java.util.Scanner;

public class U7Emoticons {

	public static void main(String[] args) {
		//Program na vstupe nacita emotikon a vypise emociu uzivatela
		//napr. -> :-)
		//<- usmev
		//-> :(
		//<- smutny
		//5 emocii; akceptovat emotikony s nosom aj bez neho
	
		String emtkn = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadaj emotikon: ");
		emtkn = sc.nextLine();
		
//		if((emtkn == ":-)") || (emtkn == ":)")) {
//			System.out.println("Usmev");
//		}
		
		switch(emtkn) {
		case ":-)":
		case ":)":
			System.out.println("Usmev");
			break;
		case ":-O":
		case ":O":
			System.out.println("Prekvapenie");
			break;
		case ":-(":
		case ":(":
			System.out.println("Smutny");
			break;
		case ":-P":
		case ":P":
			System.out.println("Vyplazeny jazyk");
			break;
		case ":-@":
		case ":@":
			System.out.println("Nahnevany");
			break;
		default:
			System.out.println("Nepoznam emotikon");
		}

	}

}

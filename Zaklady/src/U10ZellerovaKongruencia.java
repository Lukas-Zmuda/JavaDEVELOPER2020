import java.util.Scanner;

public class U10ZellerovaKongruencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rok, mesiac, den, denVTyzdni;
		System.out.println("Zadaj rok: ");
		rok = sc.nextInt();
		System.out.println("Zadaj mesiac: ");
		mesiac = sc.nextInt();
		System.out.println("Zadaj den: ");
		den = sc.nextInt();
		
		if(mesiac == 1) {
			mesiac = 13;
			rok--;
		}else if(mesiac == 2) {
			mesiac = 14;
			rok--;
		}
		
		denVTyzdni = (den + (13 * (mesiac + 1)) / 5 + (rok % 100) + ((rok % 100) / 4) +
				((rok / 100) / 4) - 2 * (rok / 100)) % 7;
		
		String denSlovom = "";
		
		switch(denVTyzdni) {
		case 2:
			denSlovom = "Pondelok";
			break;
		case 3:
			denSlovom = "Utorok";
			break;
		case 4:
			denSlovom = "Streda";
			break;
		case 5:
			denSlovom = "Stvrtok";
			break;
		case 6:
			denSlovom = "Piatok";
			break;
		case 0:
			denSlovom = "Sobota";
			break;
		case 1:
			denSlovom = "Nedela";
			break;
		}
		
		System.out.println("Den " + den + "." + mesiac + "." + rok + " je " + denSlovom);

	}

}

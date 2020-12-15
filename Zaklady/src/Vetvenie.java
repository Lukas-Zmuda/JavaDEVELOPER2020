
public class Vetvenie {

	public static void main(String[] args) {

		int a = -11;
		
		//neuplna podmienka
		if(a > 0) {
			System.out.println("a je kladne");
		}
		
		//uplna podmienka
		if(a % 2 == 0) {
			System.out.println("a je parne");
		}else {
			System.out.println("a je neparne");
		}
		
		//cislo je ok ked je z intervalu <1, 100>
		if((a >= 1) && (a <= 100)) {
			System.out.println("a je OK");
		}else {
			System.out.println("a nie je OK");
		}
		
		int den = 6;
//		if(den == 1) {
//			System.out.println("Pondelok");
//		}
		
		switch(den) {
		case 1:
			System.out.print("Pondelok");
			break;
		case 2:
			System.out.print("Utorok");
			break;
		case 3:
			System.out.print("Streda");
			break;
		case 4:
			System.out.print("Stvrtok");
			break;
		case 5:
			System.out.print("Piatok");
			break;
		case 6:
			System.out.print("Sobota");
			break;
		case 7:
			System.out.print("Nedela");
			break;
		default:
			System.out.println("Nespravny den v tyzdni!");
		}
		
		switch(den) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println(" - pracovny den");
			break;
		case 6:
		case 7:
			System.out.println(" - vikend");
		}
		
		
		
		System.out.println("Program pokracuje dalej ...");
		

	}

}

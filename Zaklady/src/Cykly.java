
public class Cykly {

	public static void main(String[] args) {
		
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");

		//cyklus s pevnym poctom opakovani
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Ahoj");
		}				
		System.out.println("Ako sa mas?");

		for(int i = 10; i > 0; i--) {
			System.out.print(i + ", ");
		}
		System.out.println();
		for(int i = 1, j = 10; i < 11; i++, j--) {
			System.out.println(i + ":" + j);
		}
		System.out.println("-------");
		//cyklus s podmienkou na zaciatku
		int k = 100;
		while(k < 11) {
			System.out.print(k + ", ");
			k++;
		}
		
		System.out.println();
		//cyklus s podmienkou na konci
		k = 100;
		do {
			System.out.print(k + ", ");
			k++;
		}while(k < 11);
	}
}

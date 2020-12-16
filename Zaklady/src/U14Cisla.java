import java.util.Scanner;

public class U14Cisla {

	public static void main(String[] args) {
		//Program na vstupe nacita pocet cisel a samotne cisla
		//na vystupe vypise pocet kladnych, pocet parnych, pocet delitelnych 5

		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Program----");
		int pocet = 0, pParnych = 0, pKladnych = 0, pDel5 = 0;
		int cislo = 0;
		String cSlovom = "";
		
		System.out.println("Zadaj pocet cisel: ");
		pocet = sc.nextInt();
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();
			cSlovom += cislo + ", ";
			if(cislo > 0) {
				pKladnych++;
			}			
			if(cislo % 2 == 0) {
				pParnych++;
			}
			if(cislo % 5 == 0) {
				pDel5++;
			}			
		}
		System.out.println("---------------------");
		System.out.println("Cisla: " + cSlovom);
		System.out.println("Pocet kladnych: " + pKladnych);
		System.out.println("Pocet parnych: " + pParnych);
		System.out.println("Pocet del. 5: " + pDel5);
		
		
		
	}

}

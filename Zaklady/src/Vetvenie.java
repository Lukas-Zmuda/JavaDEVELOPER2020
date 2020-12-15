
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
		
		
		System.out.println("Program pokracuje dalej ...");
		

	}

}

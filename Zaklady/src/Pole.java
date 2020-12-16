
public class Pole {

	public static void main(String[] args) {
		
		//deklaracia pola
		int[] vyska;
		
		//inicializacia pola
		vyska = new int[7];
		
		vyska[3] = 182;
		vyska[4] = vyska[3] - 2;
		
		
		System.out.println("Piaty v poradi ma vysku: " + vyska[4] + " cm");
		
		int[] v = new int[5];
		v[0] = 186;
		v[1] = 185;
		v[2] = 189;
		v[3] = 186;
		v[4] = 174;
		//v[5] = 168;
		
		System.out.println("Lukas je vysoky " + v[0] + " cm");
		System.out.println("Vyska ucastnikov: ");
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " cm");
		}

		String[] mena = {"Lukas", "David", "Pavol", "Tomas", "Samo"};
		System.out.println("-------------");
		for(int i = 0; i < v.length; i++) {
			System.out.println(mena[i] + " je vysoky " + v[i] + " cm");
		}
		
		System.out.println("Pocet ucastnikov: " + v.length);
		
	}

}

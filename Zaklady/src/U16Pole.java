
public class U16Pole {

	public static void main(String[] args) {

		int[] pole = {1, -4, 23, 77, 5, 8, 987, 12, -5, 10};
		
		//vypis pola odzadu v riadku (10, -5, 12, 987, 8, 5, 77, 23, -4, 1)
		for(int i = pole.length - 1; i >= 0; i--) {
			System.out.print(pole[i] + ", ");
		}
		System.out.println();
		//vypis parnych prvkov pola v riadku (-4, 8, 12, 10)
		for(int i = 0; i < pole.length; i++) {
			if(pole[i] % 2 == 0) {
				System.out.print(pole[i] + ", ");
			}
		}
		System.out.println();
		//vypis kazdy neparny prvok pola (1, 23, 5, 987, -5)
		for(int i = 0; i < pole.length; i += 2) {
			System.out.print(pole[i] + ", ");
		}

	}

}

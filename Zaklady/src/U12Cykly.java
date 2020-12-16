
public class U12Cykly {

	public static void main(String[] args) {
		
		//0, 2, 4, 6, 8, ..., 20
		for(int i = 0; i < 21; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		//1, 3, 5, 7, 9, ..., 21
		for(int i = 1; i <= 21; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		//1, 2, 4, 8, 16, 32, ..., 128
		for(int i = 1; i < 129; i *= 2) {
			System.out.print(i + ", ");
		}

	}

}

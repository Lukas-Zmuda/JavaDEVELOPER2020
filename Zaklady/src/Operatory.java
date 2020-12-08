
public class Operatory {

	public static void main(String[] args) {
		//aritmeticke
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println((double)10 / 5);
		System.out.println(10 / 3.0);
		System.out.println(10 % 5);
		
		//relacne
		System.out.println(10 < 5);
		System.out.println(10 > 5);
		System.out.println(10 <= 5);
		System.out.println(10 >= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		
		System.out.println("-----------");
		//logicke 		
		System.out.println((10 < 5)&&(10 == 10));
		System.out.println((10 < 5)||(10 == 10));
		System.out.println(!(10 < 5)&&(10 == 10));
		
		int a = 10, b = 12, c;
		c = a + b;
		c += 8; //c = c + 8;
		c -= 10;//c = c - 10;
		c *= 10; //funguje aj /= %=
		c += 1;
		c++;
		c--;
		
		System.out.println("c = " + c);
		c =+ 8;
		System.out.println(c);

	}

}

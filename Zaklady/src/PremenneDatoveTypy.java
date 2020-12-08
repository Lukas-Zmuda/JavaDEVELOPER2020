
public class PremenneDatoveTypy {

	public static void main(String[] args) {
		
		//celociselne DT
		//deklaracia premennej vek
		int rok;
		
		//inicializacia premennej
		rok = 15;
		
		short x = 12;
		
		byte a, b, c;
		short denVolna;
		byte m = 1, n = 2, r = 3;
		
		System.out.println(rok);
		System.out.println("vek = " + rok);
		
		int v = rok;
		System.out.println("v = " + v);
		
		//int => short
		rok = x;
		
		rok = 1500000;
		//short => int
		x = (short)rok;
		System.out.println("x = " + x);
		rok = 1000000;
		
		//zapis celeho cisla do inych ciselnych sustav
		int hex = 0xff;
		System.out.println(hex);
		int bin = 0b10000000;
		System.out.println(bin);
		int oct = 0123;
		System.out.println(oct);
		int am = 1_124_322;
		System.out.println(am);
		
		//desatinne cisla
		double priemer = 12.99;
		System.out.println("priemer = " + priemer);
		
		float pr = 1.36f;
		
		System.out.println((int)priemer);
		
		//znaky
		char zavinac = '@';
		zavinac = 64;
		
		System.out.println("zavinac = " + zavinac);
		char uni = '\u0123';
		System.out.println(uni);
		
		//log.hodnoty
		boolean prsi = true;
		prsi = false;

	}

}

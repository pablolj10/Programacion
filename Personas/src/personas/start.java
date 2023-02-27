package personas;

import java.util.Arrays;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		persona[] conjunto = new persona[5];
		conjunto[0] = new persona("Mario", 18);
		conjunto[1] = new persona("Lorena", 10);
		conjunto[2] = new persona("Valery", 50);
		conjunto[3] = new persona("Jandro", 2);
		conjunto[4] = new persona("Luis", 22);
		
//		for (persona ayuda : conjunto) {
//			System.out.println(ayuda);
//		}
//		
//		int[] numeros = {3, 25, 30, 18, 1, 14, 52, 69};
		
		ComparadorPersonas cp = new ComparadorPersonas();
			System.out.println(Arrays.toString(conjunto));
			Arrays.sort(conjunto,cp);
			System.out.println(Arrays.toString(conjunto));
			cp.setComoOrdenar(ComparadorPersonas.DESCENDENTE_EDAD);
			Arrays.sort(conjunto,cp);
			System.out.println(Arrays.toString(conjunto));
		
	}

}

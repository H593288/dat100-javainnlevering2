package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[");
		for (int i=0; i<tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		
		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String streng = "[";
		for(int i=0; i < tabell.length; i++) {
			   streng += tabell[i] + " ";
		
	}
	
		streng += "]";
		return streng;
}


	// c)
	public static int summer(int[] tabell) {
		
		// for-løkke
		int sum = 0;
		for (int i = 0; i < tabell.length; i++)
			sum += tabell [i];
		
		return sum;
	}
		
	public static int summer1(int[] tabell) {
		// while løkke
		int sum1 = 0;
		int i = 0;
		while (i < tabell.length) {
			sum1 += tabell [i];
			i++;
		}
		
		return sum1;
	
		}
	
	public static int summer2(int[] tabell) {
		// utvidet for-løkke
		int sum2 = 0;
		for (int j : tabell) {
			sum2 += j;	
	}
		
		return sum2;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int pos = 0;
		while(!funnet && pos < tabell.length) {
			if (tall == tabell[pos]) {
				funnet = true; 
			}
			pos++;
		}
		return funnet; 
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++)
			if (tabell[i] == tall)
				return i;
		
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] nytabell = new int[tabell.length];
		for(int i =0; i < tabell.length; i++) {
			nytabell [i] = tabell [tabell.length-1-i];
		}
		
		return nytabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int i =1;
		boolean sortert = true;
		while (sortert && i < tabell.length - 1) {
			if (tabell[i] < tabell[i-1]) {
				sortert = false;
			}
			
			i++;
		}
		
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
			
		int tabell3[] = new int [tabell1.length + tabell2.length];
		for (int i =0; i < tabell1.length; i++) {
			tabell3[i] = tabell1 [i];
		}
		
		for (int j=0; j <tabell2.length; j++) {
			tabell3[tabell1.length+j] = tabell2[j];
		}
		
		return tabell3;
	}

}



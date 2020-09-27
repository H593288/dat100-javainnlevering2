package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		System.out.print(" ");
		for (int [] i : matrise) {
			for (int j : i)
		System.out.print(j + " ");
			
		}
		
		System.out.println(" ");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng = "";
		for (int i=0; i < matrise.length; i++) {
			for (int j=0; j < matrise.length; j++) {
				streng += matrise[i][j] + " ";
			}
			streng += "\n";
		}
		
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++)
			for(int j =0; j < matrise[i].length; j++)
			nyMatrise[i][j] = matrise[i][j] * tall;
	
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;	
			for (int i =0; i < a.length; i++) {
			
				for (int j =0; j < a.length; j++)
					
				if (a[i][j] != b[i][j]) {
					
					return false;
				}
			}
			
			return lik;
		}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}

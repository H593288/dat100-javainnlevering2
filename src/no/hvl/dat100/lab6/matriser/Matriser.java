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
					
					lik = false;
				}
			}
			
			return lik;
		}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int a = matrise.length;
		int [][] nymatrise = new int [a][a];
		for (int i=0; i < a; i++) 
			for (int j=0; j < a; j++) {
				nymatrise[i][j] = matrise [j][i];
			}
		
		return nymatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int aRad = a.length;
		int aKolonne = a[0].length;
		int bRad = b.length;
		int bKolonne = b[0].length;
		
		if (aKolonne != bKolonne) {
		throw new UnsupportedOperationException("aKolonne: " + aKolonne + "matcher ikke bKolonne" + bKolonne + ".");
		}
		
		int [][] c = new int [aRad][bRad]; 
		
		for (int i=0; i< aRad; i++) {
			for (int j=0; j <bKolonne; j++) {
				c[i][j] = 0;
			}
		}
		
		for (int i=0; i < aRad; i++) {
			for (int j=0; j < bKolonne; j++) {
				for (int k=0; k < aKolonne; k++) {
					c[i][j] += a[i][k]*b[k][j];
				}
				
			}
		}
		
		return c;
}
}
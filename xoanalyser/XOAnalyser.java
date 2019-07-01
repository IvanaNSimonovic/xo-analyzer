package xoanalyser;

import java.util.Scanner;

public class XOAnalyser {

	public static int traziVodoravno(String[][] mat, int n, int m) {
		int brojac=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j].equals(" "))
					continue;
				else {
					brojac = 1;
					for (int min = 0; min < m; min++) {
						if ((j + min) < n) {
							if (mat[i][j].equals(mat[i][j + min])) {
								brojac++;
							} else {
								if (brojac >= m) {
									System.out.println("Pobednik je " + mat[i][j]);
								} else
									brojac = 0;
							}
						}
					}
				}
			}
		} return brojac;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("velicina tabele i minimum spojenih?");
		int n = sc.nextInt();
		int m = sc.nextInt();
		String mat[][] = new String[n][n];
		System.out.println("stanje tabele?");
		int brojac=0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j].equals(" ")) continue;
				else {
					brojac=1;
					for(int min=0;min<m;min++) {
						if((i+min)<n) {
							if(mat[i][j].equals(mat[i+min][j])) {brojac ++;}
							else { if (brojac>=m) {System.out.println("Pobednik je "+mat[i][j]+ "!"); break;}
							else brojac = 0;
							}
						}
						else traziVodoravno(mat, n, m);
					}
				
				}

			
			}

		}
	}
}

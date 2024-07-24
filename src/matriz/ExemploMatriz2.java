package matriz;

import java.util.Random;

public class ExemploMatriz2 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		Random r = new Random();

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(99);
				System.out.print(matriz[i][j] +"\t");
				
			}
		}
		
		System.out.println("Soma das Linhas:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			int soma = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(99);
				soma += matriz[i][j];
			}
			System.out.println("Linha " + (i+1) + ": " + soma);
		}
		
		System.out.println("Soma das Colunas:");
		for (int i = 0; i < matriz.length; i++) {
			int soma = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(99);
				soma += matriz[j][i];
				System.out.print(matriz[i][j] +"\t");

			}
			System.out.println("\t Coluna " + (i+1) + ": " + soma);
		}
		
		System.out.println("Soma da diagonal da matriz:");
		int dp = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(10);
				if (i==j) {
					dp += matriz[i][j];
				}
			}
		}
		System.out.println(dp);
	}
}

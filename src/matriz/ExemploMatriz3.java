package matriz;

import javax.swing.JOptionPane;

public class ExemploMatriz3 {
	public static void main(String[] args) {

		int qtdAtletas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Atletas:"));
		int qtdDistancias = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Distancias:"));

		String[] atletas = new String[qtdAtletas];
		String[] distancias = new String[qtdDistancias];
		int[][] tempos = new int[qtdAtletas][qtdDistancias];

		for (int i = 0; i < distancias.length; i++) {
			distancias[i] = JOptionPane.showInputDialog((i + 1) + " distância?");
		}

		for (int i = 0; i < tempos.length; i++) {
			atletas[i] = JOptionPane.showInputDialog("Atleta " + (i + 1) + ":");
			for (int j = 0; j < tempos[i].length; j++) {
				tempos[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
						"Qual o tempo que o atleta " + atletas[i] + " percorreu " + distancias[j] + "KM?"));
			}
		}
		
		for (int i = 0; i < tempos.length; i++) {
			int soma = 0;
			for (int j = 0; j < tempos[i].length; j++) {
				soma += tempos[i][j];
			}
			System.out.println(atletas[i] + ": " + soma
					);
		}
		
	}
}

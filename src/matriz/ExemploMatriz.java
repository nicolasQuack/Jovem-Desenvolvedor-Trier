package matriz;

import javax.swing.JOptionPane;

public class ExemploMatriz {
	public static void main(String[] args) {
		int atend[][] = new int [7][3];
		for (int i = 0; i < 7; i ++) {
			for (int j = 0; j<3; j++) {
				atend[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Qtd"));
			}
		}
	}
}

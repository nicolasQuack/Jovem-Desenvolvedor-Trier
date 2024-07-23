package avalicao1;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int mbs = Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade de download da sua internet?"));
		int file = Integer.parseInt(JOptionPane
				.showInputDialog("Qual o tamanho do arquivo a ser baixado, insira o valor em mb(megabytes)?"));
		int rawTime = file / mbs;
		if (rawTime < 60) {
			JOptionPane.showMessageDialog(null, "Seu download acabará em: 0min " + rawTime + "sec...");
		} else {
			int min = rawTime / 60;
			int sec = rawTime % 60;
			JOptionPane.showMessageDialog(null, "Seu download acabará em: " + min + "min" + " " + sec + "sec...");
		}
	}
}

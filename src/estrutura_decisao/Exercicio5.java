package estrutura_decisao;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		String letter = JOptionPane.showInputDialog("Insira uma letra:");
		if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") {
			JOptionPane.showMessageDialog(null, "A letra: " + letter + " é uma vogal");
		} else {
			JOptionPane.showMessageDialog(null, "A letra: " + letter + " não é uma vogal");
		}
	}
}

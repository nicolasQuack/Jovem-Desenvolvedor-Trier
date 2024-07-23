package avalicao1;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		Double alc = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do álcool:"));
		Double gas = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da gasolina:"));
		if (alc <= gas * 0.7) {
			JOptionPane.showMessageDialog(null, "Compensa abastecer mais com álcool");
		} else {
			JOptionPane.showMessageDialog(null, "Compensa mais abastecer com gasolina");
		}
	}
}

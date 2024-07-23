package estrutura_decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o número 1:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o número 2:"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o número 3:"));
		if (num1 > num2 || num1 > num3) {
			JOptionPane.showMessageDialog(null, num1 + " é o maior número");
		}
		if (num2 > num1 || num2 > num3) {
			JOptionPane.showMessageDialog(null, num2 + " é o maior número");
		}
		if (num3 > num1 || num3 > num1) {
			JOptionPane.showMessageDialog(null, num3 + " é o maior número");
		}
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			JOptionPane.showMessageDialog(null, "Há números iguais.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Algo de errado não está certo.");
		}
	}
}

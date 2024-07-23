package avalicao1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de B:"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C:"));
		double dentroDaRaiz = (((b * b) - 4 * a * c) / 2 * a);
		double raiz = Math.sqrt(dentroDaRaiz <= 0 ? dentroDaRaiz * -1 : dentroDaRaiz);
		JOptionPane.showMessageDialog(null, "O resultado da equação é \n x1: " + (-b + raiz) + "\n x2: " + (-b - raiz));
	}
}

package aula_introducao;

import javax.swing.JOptionPane;

public class ExemploEntradaSaidaJopt {

	public static void main(String[] args) {
		Double base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do triângulo:"));
		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do triângulo:"));
		JOptionPane.showMessageDialog(null, "A área é: " + (base * altura) / 2);
	}

}

package estrutura_repeticao.exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		
		DecimalFormat dFormat = new DecimalFormat("0.000");
		
		Double n = Double
				.parseDouble(JOptionPane.showInputDialog("Insira um número N para a seguinte expressão: 1/2 + ... + 1/n:"));

		Double soma = 0.0;
		
		for (Double i = 1.0; i <= n; i++) {
			soma += (1/i);
		}
		JOptionPane.showMessageDialog(null, "O total da soma é: " + dFormat.format(soma));
	}
}

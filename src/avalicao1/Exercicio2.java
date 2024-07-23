package avalicao1;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		double dolar = Double
				.parseDouble(JOptionPane.showInputDialog("Informe o valor da taxa cambial diária do dólar($):"));
		double real = Double.parseDouble(
				JOptionPane.showInputDialog("Informe o valor em R$(real) a ser convertido para dólar($): "));
		JOptionPane.showMessageDialog(null, "Com R$" + real + " você terá: $" + real / dolar);
	}
}

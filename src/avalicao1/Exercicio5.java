package avalicao1;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		Double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da compra:"));
		int parcelas = Integer.parseInt(
				JOptionPane.showInputDialog("Insira a quantidade de parcelas: \n 1 - à vista \n <= 3 - valor sem juros \n > 3 - 15% sobre o valor do produto"));
		if (parcelas <= 0) {
			JOptionPane.showMessageDialog(null, "Insira um valor válido de parcelas!");
		}
		if (parcelas == 1) {
			valorCompra = valorCompra * 0.9;
			JOptionPane.showMessageDialog(null, valorCompra);
		} else if (parcelas <= 3) {
			JOptionPane.showMessageDialog(null, valorCompra + " " + valorCompra / parcelas);
		}
		if (parcelas > 3) {
			valorCompra = valorCompra * 1.15;
			JOptionPane.showMessageDialog(null, valorCompra + " " + valorCompra / parcelas);
		}
	}
}

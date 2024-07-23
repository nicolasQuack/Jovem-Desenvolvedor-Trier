package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExemploEnquanto {
	public static void main(String[] args) {
		double valorOrcamente = Double.parseDouble(JOptionPane.showInputDialog("Qual valor você tem para gastar?"));
		double valorGasto = 0;
		
		while (valorGasto <= valorOrcamente) {
			valorGasto += Double.parseDouble(JOptionPane.showInputDialog("Valor que gastou:\n Valor gasto: " + valorGasto));
		}
		JOptionPane.showMessageDialog(null, "Voce não pode gastar mais!\n Valor do orçamento: " + valorOrcamente + "\n Valor gasto: " + valorGasto);
		
	}
}

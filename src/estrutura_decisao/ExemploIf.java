package estrutura_decisao;

import javax.swing.JOptionPane;

public class ExemploIf {
	public static void main(String[] args) {
		int idadeJoaozinho = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de Joãozinho?"));
		int idadeMariazinha = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de Mariazinha?"));
		
		Boolean verificacao = idadeJoaozinho > idadeMariazinha;
		if (idadeJoaozinho <= 0 || idadeMariazinha <= 0) {
			JOptionPane.showMessageDialog(null, "Insira uma idade valida.");
		} else {
			if (verificacao) {
				JOptionPane.showMessageDialog(null, "João é mais velho.");
			} else if (!verificacao) {
				JOptionPane.showMessageDialog(null, "Mariazinha é mais velha.");
			} else {
				JOptionPane.showMessageDialog(null, "Ambos têm a mesma idade.");
			}
		}

	}
}

package estrutura_decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int firstDay = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira data:"));
		int firstMonth = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira mês:"));
		int firstYear = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira ano:"));
		
		int secondDay = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda data:"));
		int secondMonth = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda mês:"));
		int secondYear = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda ano:"));
		
		if (firstDay == secondDay && firstMonth == secondMonth && firstYear == secondYear) {
			JOptionPane.showMessageDialog(null, "Ambas as datas são iguais");
		} else {
			if (firstYear < secondYear || firstMonth < secondMonth || firstDay < secondDay) {
				JOptionPane.showMessageDialog(null, "A data que ocorreu primeiro é: " + firstDay + "/" + firstMonth + "/" + firstYear);
			} else {
				JOptionPane.showMessageDialog(null, "A data que ocorreu primeiro é: " + secondDay + "/" + secondMonth + "/" + secondYear);
			}
		}
	}
}

package aula_introducao;

import javax.swing.JOptionPane;

public class ExercicioConversaoDeMedidas {
	public static void main(String[] args) {
		Double pes = Double.parseDouble(JOptionPane.showInputDialog("Insira uma medida em pés:"));
		int medida = Integer.parseInt(
			JOptionPane.showInputDialog("Insira a medida que você deseja(1 - Polegadas, 2 - Jardas, 3 - Milhas):"));
		switch (medida) {
		case 1:
			JOptionPane.showMessageDialog(null, pes * 12.0);
		case 2:
			JOptionPane.showMessageDialog(null, pes / 3.0);
		case 3:
			JOptionPane.showMessageDialog(null, pes / 5280.0);
		default:
			JOptionPane.showMessageDialog(null, "Insira um valor de medida valido!");
		}

	}
}

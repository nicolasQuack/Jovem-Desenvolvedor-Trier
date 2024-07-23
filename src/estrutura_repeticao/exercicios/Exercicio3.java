package estrutura_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor base da exponensiação:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Agora, insira o expoente:"));
		
		int resultado = a;
		
		if (b == 0) {
			resultado = 1;
		} else if (b > 0) {
			for (int i = 0; i + 1 < b; i++) {
				resultado *= a;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Só aceitamos expoentes inteiros positivos.");
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}

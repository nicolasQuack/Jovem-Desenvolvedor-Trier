package estrutura_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro positivo N, para: N!"));
		
		int resultado = n;
		
		for (int i = n - 1; i > 0; i--) {
			resultado *= i;
		}
		
		JOptionPane.showMessageDialog(null, "resultado: " + resultado);
	}
}

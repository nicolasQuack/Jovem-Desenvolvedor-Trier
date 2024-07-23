package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i += 10) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		for (int i = 100; i > 0; i -= 10) {
			System.out.print(i + " ");
		}
		
		int pontoInicial = Integer.parseInt(JOptionPane.showInputDialog("Início"));
		int pontoFinal = Integer.parseInt(JOptionPane.showInputDialog("Final"));
		
		if (pontoInicial < pontoFinal) {
			for(int i = pontoInicial; i<pontoFinal; i++) {
				System.out.println(i + " ");
			}
		} else {
			for(int i = pontoInicial; i<pontoFinal; i--) {
				System.out.println(i + " ");
			}
		}
		
	}
}

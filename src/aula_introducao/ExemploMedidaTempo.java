package aula_introducao;

import javax.swing.JOptionPane;

public class ExemploMedidaTempo {
	public static void main(String[] args) {
		String[] nomes = new String[100000];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = "nome " + i;
		}
		
		String nmBusca = JOptionPane.showInputDialog("Nome para buscar");
		
		for (String s : nomes) {
			if (s.equals(nmBusca)) {
				System.out.println("Achei");
			}
		}
	}
}

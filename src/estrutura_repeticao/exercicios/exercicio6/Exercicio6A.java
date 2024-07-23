package estrutura_repeticao.exercicios.exercicio6;

import javax.swing.JOptionPane;

public class Exercicio6A {
	public static void main(String[] args) {
		int quantidadePessoas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantida de pessoas que você quer inserir:"));
		
		int somaIdades = 0;
		String somaNome = "";
		
		for (int i = 1; i <= quantidadePessoas; i++) {
			String nome = JOptionPane.showInputDialog("Insira o nome da pessoa número " + i + ":");
			somaNome += "- " + nome + "\n";
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Agora insira a idade da pessoa número " + i + ":"));
			somaIdades += idade;
		}
		
		JOptionPane.showMessageDialog(null, "Nomes inseridos: \n" + somaNome + "\n" + "Soma total das idades: " + somaIdades);
	}
}

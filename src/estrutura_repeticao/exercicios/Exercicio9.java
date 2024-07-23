package estrutura_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio9 {
	public static void main(String[] args) {
		String nomeProfessor = JOptionPane.showInputDialog("Insira o seu nome:");
		int quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos da sala:"));
		
		String relatorio = "Sala do(a) " + nomeProfessor + "\n\n Relatório de aprovações: \n\n";

		for (int i = 1; i <= quantidadeAlunos; i++) {
			String nomeAluno = JOptionPane.showInputDialog("Insira o nome do aluno " + i + ":");
			Float mediaAluno = Float.parseFloat(JOptionPane.showInputDialog("Qual a média do aluno(a) " + nomeAluno + "?"));
			
			if (mediaAluno >= 7.0) {
				
			}
			
//			relatorio += "- " + nomeAluno + ": " + ;
			
			
		}
	}
}

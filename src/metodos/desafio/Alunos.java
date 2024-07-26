package metodos.desafio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Alunos {
	
	String nome;
	int idade;
	
	ArrayList<Double> notas = new ArrayList<Double>(3);
	
	protected void adicionarNota() {
		notas.add(Double.parseDouble(JOptionPane.showInputDialog("Insira a nota desejada:")));	
	}
	
	protected void deletarNota(int i) {
		i -= 1;
		notas.remove(i);
	}
	
	protected void editarNota(int i, Double nota) {
		i -= 1;
		notas.remove(i);
		notas.add(i, nota);
	}
	
	protected Double calcMedia() {
		Double soma = 0.0;
		for (Double n : notas) {
			soma += n;
		}
		return soma/notas.size();
	}
	
	protected String calcSituacao() {
		Double media = calcMedia();
		if (media >= 0.0 && media <= 10.0) {
			if (media < 3.0) {
				return "Reprovado";
			} else if (media < 7.0) {
				return "Recuperação";
			} else {
				return "Aprovado";
			}
		}
		return "Aluno ainda não possui média.";
	}
	
}

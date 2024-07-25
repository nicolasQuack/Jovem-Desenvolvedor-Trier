package metodos.desafio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Alunos {
	
	String nome;
	int idade;
	
	ArrayList<Double> notas = new ArrayList<Double>();
	
	protected void addNota() {
		notas.add(Double.parseDouble(JOptionPane.showInputDialog("Insira a nota desejada:")));	
	}
	
	protected Double calcMedia() {
		Double soma = 0.0;
		for (Double n : notas) {
			soma += n;
		}
		return soma;
	}
	
}

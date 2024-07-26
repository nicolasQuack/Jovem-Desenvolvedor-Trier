package avaliacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Medicamento {
	String nome;
	ArrayList<String> ativos = new ArrayList<String>();
	
	protected void adicionarAtivos (String nome) {
		String nomeAtivo = JOptionPane.showInputDialog("Insira o nome do composto ativo do(a) " + nome + ":");
		
		if (nomeAtivo.isBlank()) {
			adicionarAtivos(nome);
		} else {
			
			ativos.add(nomeAtivo);
			
			int op = 1;
			op = Integer.parseInt(JOptionPane.showInputDialog("Você quer cadastrar outro composto para esse medicamento?\n\n1 - Sim\n2 - Não\n\n"));
			if (op == 1) {
				adicionarAtivos(nome);
			}
		}
		
		
	}
}

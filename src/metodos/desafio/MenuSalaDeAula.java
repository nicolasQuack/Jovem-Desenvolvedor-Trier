package metodos.desafio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MenuSalaDeAula {

	public static int menu() {

		String msg = "Bem vindo professor(a): " + "\n\n" + "1 - Cadastrar Aluno" + "\n" + "2 - Lista Alunos" + "\n"
				+ "3 - Buscar Aluno" + "\n\n" + "4 - Listar Aprovados" + "\n" + "5 - Listar Em Recuperação" + "\n"
				+ "6 - Lista Reprovados" + "\n\n" + "0 - Sair";

		int op = Integer.parseInt(JOptionPane.showInputDialog(msg));

		if (op < 0 || op > 6) {
			menu();
		}

		return op;
	}

	public static void cadastrarAluno(ArrayList<Alunos> lista) {
		String nome = JOptionPane.showInputDialog("Insira o nome do aluno:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do(a) " + nome));

		Alunos aluno = new Alunos();
		aluno.nome = nome;
		aluno.idade = idade;

		lista.add(aluno);

	}

	public static void listarAlunos(ArrayList<Alunos> lista) {

		String msg = "Total de alunos: " + lista.size() + "" + "\n"
				+ "Digite o número do aluno para adicionar/editar/remover nota ou precione ENTER para sair:" + "\n\n";

		for (Alunos aluno : lista) {
			msg += (lista.indexOf(aluno) + 1) + " - " + aluno.nome + " | " + aluno.idade + " anos\n";
		}

		if (lista.isEmpty()) {
			msg = "Por favor, cadastre pelo menos um aluno.";
			JOptionPane.showMessageDialog(null, msg);
		} else {
			int alunoSelecionado = Integer.parseInt(JOptionPane.showInputDialog(msg + "\n")) - 1;

			if (alunoSelecionado >= 0 && alunoSelecionado < lista.size()) {
				MenuNotas.menuNotas((lista.get(alunoSelecionado)));
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um número válido!");
				listarAlunos(lista);
			}
		}
		
	}

	public static void buscarAlunos(ArrayList<Alunos> lista) {
		String msg = "";

		String nomeDesejado = JOptionPane.showInputDialog("Insira o nome do aluno desejado:");

		for (Alunos aluno : lista) {
			if (aluno.nome.contains(nomeDesejado)) {
				msg += (lista.indexOf(aluno) + 1) + " - " + aluno.nome + " | " + aluno.idade + "\n";
			}
		}

		if (msg.isBlank()) {
			JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
		} else {
			int alunoSelecionado = Integer.parseInt(JOptionPane.showInputDialog("Segue abaixo, o aluno desejado:\n\n" + msg + "\n")) - 1;
						
			if (alunoSelecionado >= 0 && alunoSelecionado < lista.size()) {
				MenuNotas.menuNotas((lista.get(alunoSelecionado)));
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um número válido!");
				listarAlunos(lista);
			}
		}

	}
	

	public static void alunosAprovados(ArrayList<Alunos> lista, int op) {
		
		String msg = "Alunos aprovados:\n\n";
		
		for (Alunos aluno : lista) {
			if (aluno.calcSituacao() == "Aprovado" && op == 1) {
				msg += (lista.indexOf(aluno) + 1) + " - " + aluno.nome + ": " + aluno.calcMedia() + " -> Aprovado\n";
			} else if (aluno.calcSituacao() == "Recuperação" && op == 2) {
				msg += (lista.indexOf(aluno) + 1) + " - " + aluno.nome + ": " + aluno.calcMedia() + " -> Recuperação\n";
			} else if (aluno.calcSituacao() == "Reprovado" && op == 3) {
				msg += (lista.indexOf(aluno) + 1) + " - " + aluno.nome + ": " + aluno.calcMedia() + " -> Reprovado\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
}

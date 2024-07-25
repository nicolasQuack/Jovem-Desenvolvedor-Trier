package metodos.desafio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MenuSalaDeAula {

	public static void main(String[] args) {
		ArrayList<Alunos> lista = new ArrayList<Alunos>();

		int op = 0;

		do {
			op = menu();

			switch (op) {
			case 1: {
				cadastrarAluno(lista);
				break;
			}
			case 2: {
				listarAlunos(lista);
				break;
			}
			}

		} while (op != 0);

	}

	public static int menu() {

		String msg = "Bem vindo professor(a): " 
		+ "\n\n" 	
		+ "1 - Cadastrar Aluno" 
		+ "\n" 
		+ "2 - Lista Alunos"
		+ "\n"
		+ "3 - Buscar Aluno" 
		+ "\n\n" 
		+ "4 - Listar Aprovados" 
		+ "\n" + "5 - Listar Em Recuperação" 
		+ "\n"
		+ "6 - Lista Reprovados" 
		+ "\n\n" 
		+ "0 - Sair";

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
		
		String msg = "Total de alunos: " + lista.size() + "\n\n";
		
		for (Alunos aluno : lista) {
			msg += (aluno.nome + " | " + aluno.idade + " anos\n");
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
}

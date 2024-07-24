package matriz;

import javax.swing.JOptionPane;

public class DesafioMatriz {
	public static void main(String[] args) {

		String msg = "Bem vindo professor! \n\n" + "Seleciona uma das seguintes opções:"
				+ "\n\n1 - Cadastrar Aluno e Notas" + "\n2 - Listar Alunos" + "\n3 - Buscar por Aluno"
				+ "\n4 - Aprovados" + "\n5 - Em Recuperação" + "\n6 - Reprovados" + "\n\n0 - Sair";
		int op = 0;

		// Montando uma matriz
		int qtAlunos = 0;
		int qtProvas = 0;

		qtAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos têm nessa sala?"));
		qtProvas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas têm trimestralmente nessa sala?"));

		String[][] matrizSala = new String[qtAlunos][qtProvas];

		int alunoAtual = 0;
		String[] nomeAlunos = new String[qtAlunos];

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(msg));
			switch (op) {
			// Cadastrar alunos
			case 1: {

				nomeAlunos[alunoAtual] = JOptionPane
						.showInputDialog("Insira o nome do " + (alunoAtual + 1) + "º aluno:");

				if (nomeAlunos[alunoAtual].isEmpty()) {
					JOptionPane.showMessageDialog(null, "Insira um nome válido!");
				} else {
					for (int j = 0; j < matrizSala[alunoAtual].length; j++) {
						matrizSala[alunoAtual][j] = JOptionPane.showInputDialog(
								"Insira a " + (j + 1) + "ª nota do aluno(a) " + nomeAlunos[alunoAtual] + ":");
						if (matrizSala[alunoAtual][j].isEmpty()) {
							matrizSala[alunoAtual][j] = "0";
						}
					}
					if (alunoAtual < qtAlunos) {
						alunoAtual++;
					}
				}
				
				break;
			}
			// Lista alunos
			case 2: {
				
				String msg2 = "";
				
				for (int i = 0; i < alunoAtual; i++) {
					msg2 += nomeAlunos[i] + ": ";
					for (int j = 0; j < matrizSala[i].length; j++) {
						msg2 += "\t" + matrizSala[i][j];
					}
					msg2 += "\n";
				}
				
				JOptionPane.showMessageDialog(null, "Alunos cadastrados e suas respectivas notas:\n\n"
						+ (alunoAtual == 0 ? "Não possuí nenhum aluno cadastrado :(" : "") + msg2);
				
				
			}

			}
		} while (op != 0);
	}
}

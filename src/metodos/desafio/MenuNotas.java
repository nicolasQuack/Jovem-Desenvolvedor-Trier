package metodos.desafio;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MenuNotas {
	public static void menuNotas(Alunos aluno) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		String msgNotas = "\n\t";
		
		if (!aluno.notas.isEmpty()) {
			for (int i = 0; i < aluno.notas.size(); i++) {
				msgNotas += (i+1) + " - " + aluno.notas.get(i) + "\n\t";
			}
		}
		
		String msg = "Aluno(a) Selecionado(a): " + aluno.nome + "\n\n" + "Notas: "
				+ (aluno.notas.isEmpty() ? "Não há notas" : msgNotas + "\n" + "Média: " + df.format(aluno.calcMedia())) + "\n" + "Situação: " + aluno.calcSituacao() + "\n\n" + "Selecione uma das opções:" + "\n\n"
				+ "1 - Adicionar uma nota\n" + "2 - Editar uma nota\n" + "3 - Remover uma nota" + "\n\n" + "0 - Sair";

		int op = 0;

		op = Integer.parseInt(JOptionPane.showInputDialog(msg));
		switch (op) {
		case 1: {
			aluno.adicionarNota();
			menuNotas(aluno);
			break;
		}
		case 2: {
			aluno.editarNota(Integer.parseInt(JOptionPane.showInputDialog("Selecione a nota que deseja editar:" + msgNotas)), Double.parseDouble(JOptionPane.showInputDialog("Insira a nova nota:")));
			menuNotas(aluno);
			break;
		}
		case 3: {
			aluno.deletarNota(Integer.parseInt(JOptionPane.showInputDialog("Insira qual a nota deseja remover:" + msgNotas)));
			menuNotas(aluno);
			break;
		}
		}

	}
}

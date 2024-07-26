package avaliacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		ArrayList<Medicamento> lista = new ArrayList<Medicamento>();

		int opcao = 0;
		do {
			opcao = menu(lista);
			switch (opcao) {
			case 1: {
				cadastrarMedicamento(lista);
				break;
			}
			case 2: {
				listarMedicamentos(lista);
				break;
			}
			case 3: {
				buscarPorPrincipioAtivo(lista);
				break;
			}
			}
		} while (opcao != 0);

	}

	public static int menu(ArrayList<Medicamento> lista) {
		String msg = "Bem vindo,\n" + (100.00 - ((100.00 * lista.size()) / 500)) + "% de memória disponível\n\n"
				+ "Selecione uma das opções para continuar:\n\n" + "1 - Cadastrar medicamento\n"
				+ "2 - Listar medicamentos\n" + "3 - Procurar por princípio ativo\n\n" + "0 - Sair";
		int opcao = 0;

		opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));

		if (opcao <= 3 && opcao >= 0) {
			return opcao;
		}
		return 0;
		
	}

	public static void cadastrarMedicamento(ArrayList<Medicamento> lista) {
		if (lista.size() < 500) {
			Medicamento medicamento = new Medicamento();

			medicamento.nome = JOptionPane.showInputDialog("Insira o nome do medicamento:");
			if (medicamento.nome.isBlank()) {
				cadastrarMedicamento(lista);
			}
			medicamento.adicionarAtivos(medicamento.nome);
			lista.add(medicamento);
		}
	}

	public static void listarMedicamentos(ArrayList<Medicamento> lista) {
		String msg = "Lista total de medicamentos:\n" + lista.size() + "/500\n\n";

		for (Medicamento medicamento : lista) {
			msg += ((lista.indexOf(medicamento) + 1) + " - " + medicamento.nome + ": ");
			for (int i = 0; i < medicamento.ativos.size(); i++) {
				msg += medicamento.ativos.get(i)
						+ (medicamento.ativos.get(i) == medicamento.ativos.get(medicamento.ativos.size() - 1) ? "."
								: ", ");
			}
			msg += "\n";
		}

		JOptionPane.showMessageDialog(null, msg);
	}

	public static void buscarPorPrincipioAtivo(ArrayList<Medicamento> lista) {
		String nomePrincipioAtivo = JOptionPane.showInputDialog("Insira o nome do princípio ativo desejdo:");

		if (nomePrincipioAtivo.isBlank()) {
			JOptionPane.showMessageDialog(null, "Insira algum texto.");
			buscarPorPrincipioAtivo(lista);
		} else {
			String msg = "Princípio desejado: " + nomePrincipioAtivo + "\n\n";

			for (Medicamento medicamento : lista) {
				if (medicamento.ativos.contains(nomePrincipioAtivo)) {
					msg += ((lista.indexOf(medicamento) + 1) + " - " + medicamento.nome + ": ");
					for (int i = 0; i < medicamento.ativos.size(); i++) {
						msg += medicamento.ativos.get(i)
								+ (medicamento.ativos.get(i) == medicamento.ativos.get(medicamento.ativos.size() - 1)
										? "."
										: ", ");
					}

					msg += "\n";
				}
			}

			JOptionPane.showMessageDialog(null, msg);
		}

	}

}

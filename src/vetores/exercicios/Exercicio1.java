package vetores.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		String nomeMercado = JOptionPane.showInputDialog("Insira o nome do Mercado");

		String menu = "Bem vindo ao mercado " + nomeMercado + "\n\n" + "Selecione uma das opções:\n"
				+ "1 - Cadastrar Mercadoria\n" + "2 - Listar Mercadorias\n\n" + "0 - Sair\n";
		int opcao = 0;
		int numMaxMercadorias = 50;

		String[] nomeMercadoria = new String[numMaxMercadorias];
		int[] quantidadeMercadoria = new int[numMaxMercadorias];
		int id = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1: {
				if (id < numMaxMercadorias) {
					String nomeNovaMercadoria = JOptionPane
							.showInputDialog("Insira o nome da mercadoria a ser adicionada:");
					int quantidadeNovaMercadoria = Integer
							.parseInt(JOptionPane.showInputDialog("Insira o estoque do(a) " + nomeNovaMercadoria));
					nomeMercadoria[id] = nomeNovaMercadoria;
					quantidadeMercadoria[id] = quantidadeNovaMercadoria;
					id++;
				} else {
					JOptionPane.showMessageDialog(null, "Número máximo de produtos atingido.");
				}
				break;
			}
			case 2: {
				String msg = "";
				for (int i : quantidadeMercadoria) {
					msg += nomeMercadoria[i] + " " + quantidadeMercadoria[i];
				}
				JOptionPane.showMessageDialog(null, msg);
			}
			}
		} while (opcao != 0);
	}
}

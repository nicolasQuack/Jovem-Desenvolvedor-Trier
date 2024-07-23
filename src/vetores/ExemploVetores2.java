package vetores;

import javax.swing.JOptionPane;

public class ExemploVetores2 {
	public static void main(String[] args) {
		String menu = "1 - Cadastrar\n" + "2 - Nome da pessoa mais velha\n" + "3 - Buscar pessoa\n\n"
				+ "9 - SAIR";
		int op = 0;

		int qt = 0;
		String[] nomes = new String[100];
		int[] idades = new int[100];

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				if (qt < 100) {
					nomes[qt] = JOptionPane.showInputDialog("Nome :");
					idades[qt] = Integer.parseInt(JOptionPane.showInputDialog("Idade do(a) " + nomes[qt]));
					qt++;
				} else {
					JOptionPane.showMessageDialog(null, "Memória cheia");
				}
				break;
			case 2:
				String nomeMaisVelho = nomes[0];
				int idadeMaisVelho = idades[0];
				for (int i : idades) {
					if (idades[i] > idadeMaisVelho) {
						idadeMaisVelho = idades[i];
					}
				}
				JOptionPane.showMessageDialog(null,
						"A Pessoa mais velha é " + nomeMaisVelho + ", com " + idadeMaisVelho + " anos.");
				break;
			case 3:
				String nomeBusca = JOptionPane.showInputDialog("Burcar por pessoa");
				String achou = "Nome não encontrado";
				int pos = 0;
				do {
					if (nomes[pos].equals(nomeBusca)) {
						achou = "Encontrado " + nomes[pos] + " que está na posição " + (pos + 1);
					}
				} while (pos < qt && achou.equals("Nome não encontrado"));
				JOptionPane.showMessageDialog(null, achou);
				break;
			case 9:
				break;
			default: JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (op != 9);
	}

}

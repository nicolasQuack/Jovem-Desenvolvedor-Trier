package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExemploMenu {
	public static void main(String[] args) {
		String menu = "1 - Entrada: Bruschetta de Tomate e Manjericão\n"
				+ "2 - Prato Principal: Frango Grelhado com Legumes Assados\n"
				+ "3 - Opção Vegetariana: Risoto de Cogumelos\n" + "4 - Prato de Carne: Bife à Parmegiana\n"
				+ "5 - Sobremesa: Sorvete de Baunilha com Calda de Chocolate\n\n"
				+ "9 - Fechar menu e finalizar pedido.";

		String pedido = "";

		int op = 9;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				pedido += "Entrada: Bruschetta de Tomate e Manjericão\n";
				break;
			case 2:
				pedido += "Prato Principal: Frango Grelhado com Legumes Assados\n";
				break;
			case 3:
				pedido += "Opção Vegetariana: Risoto de Cogumelos\n";
				break;
			case 4:
				pedido += "Prato de Carne: Bife à Parmegiana\n";
				break;
			case 5:
				pedido += "Sobremesa: Sorvete de Baunilha com Calda de Chocolate";
				break;
			case 9: {
				if (pedido == "") {
					pedido += "Pedido vazio.";
				}
			}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Insira um número valido.");
			}
		} while (op != 9);

		JOptionPane.showMessageDialog(null, pedido);
	}
}

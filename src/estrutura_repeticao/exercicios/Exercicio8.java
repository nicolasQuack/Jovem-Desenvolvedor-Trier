package estrutura_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) {
		Double saldo = 3000.00;
		int op = 9;
		String extrato = "D: " + saldo + ", Saldo: " + saldo + "\n";

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Olá, seja bem vindo ao Canco Nicolas: \n\n Você possuí um saldo de: " + saldo
					+ "\n\n Selecione uma ação: \n 1 - (D) Depositar \n 2 - (R) Sacar \n 3 - Ver extrato \n 9 - Sair"));
			switch (op) {
			case 1: {
				Double depositar = Double
						.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar:"));
				saldo += depositar;
				extrato += "D: " + depositar + ", Saldo: " + saldo + "\n";
				break;
			}
			case 2: {
				Double retirar = Double
						.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar:"));
				saldo -= retirar;
				extrato += "R: " + retirar + ", Saldo: " + saldo + "\n";
				break;
			}
			case 3: {
				JOptionPane.showMessageDialog(null, "Seu extrato:\n\n" + extrato + "\n\n Seu saldo: " + saldo);
				break;
			}
			case 9:
				JOptionPane.showMessageDialog(null, "Obrigado pela preferência, Banco Nicolas agradece!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Insira um opção válida!");
			}
		} while (op != 9);
	}
}

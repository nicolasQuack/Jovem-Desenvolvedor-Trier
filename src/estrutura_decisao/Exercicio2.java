package estrutura_decisao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i < 4; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "º número:"));
			if(!arr.isEmpty()) {
				if (num <= arr.getFirst()) {
					arr.addFirst(num);
				} else {
					arr.add(num);
				}
			}
			if(arr.isEmpty()) {
				arr.add(num);
			}
		}
		JOptionPane.showMessageDialog(null, arr);
	}
}

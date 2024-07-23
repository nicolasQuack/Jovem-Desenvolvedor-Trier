package vetores;

import java.util.Random;

public class ExemploVetores {
	public static void main(String[] args) {
		String[] meses = { "Janeiro", "Fevereiro", "Março" };

//		for (String m : meses) {
//			System.out.println(m);
//		}
		
		System.out.println(meses[new Random().nextInt(3)]);
	}
}

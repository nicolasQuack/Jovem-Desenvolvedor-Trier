package estrutura_repeticao.exercicios;

public class Exercicio5 {
	public static void main(String[] args) {
		
		int resultado = 0;
		for (int i = 1; i <= 100; i ++) {
			if (i % 2 == 0) {
				resultado += i;
			} else {
				resultado -= i;
			}
		}
		System.out.println(resultado);
	}
}

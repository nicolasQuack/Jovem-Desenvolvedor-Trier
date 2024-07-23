package aula_introducao;

import java.util.Random;

public class ExemploRandom {
	public static void main(String[] args) {
		Random r = new Random();
		int n = 0;
		do {
			n = r.nextInt();
			System.out.println(n);
		} while (n <= 1000 && n >= 0);
	}
}

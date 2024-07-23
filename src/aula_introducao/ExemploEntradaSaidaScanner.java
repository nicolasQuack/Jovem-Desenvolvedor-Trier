package aula_introducao;

import java.util.Scanner;

public class ExemploEntradaSaidaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o seu nome:");
		String nome = sc.next();
		System.out.println("Insira o seu peso:");
		double peso = sc.nextDouble();
		System.out.println("Insira a sua altura:");
		double altura = sc.nextDouble();
		double imc = peso / Math.pow(2, altura);
		sc.close();
		System.out.println(nome + ", seu imc é: " + imc);
	}

}

package aula_introducao;

public class ExemploOperadores {

	public static void main(String[] args) {
		int int1 = 10;
		int int2 = -5;
		int int3 = 3;

		double double1 = 2.5;
		double double2 = -5.0;
		double double3 = 3.3;

		String str1 = "CASA";
		String str2 = "ESCOLA";
		String str3 = " ";
		String str4 = "10";
		String str5 = "cASA";

		char c1 = 'A';
		char c2 = '5';
		char c3 = ' ';

//		boolean b1 = true;
//		boolean b2 = false;
//		boolean b3 = true;

		// Comentario Unica Linha

		/*
		 * 
		 * EXEMPLOS DE OPERÇÕES ARITIMÉTICAS
		 * 
		 */

		// SOMA

		int r1 = int1 + int2;
		double r2 = double1 + double2;
		double r3 = int1 + double2;

		System.out.println("Some de dois inteiros: " + r1);
		System.out.println("Some de dois double: " + r2);
		System.out.println("Some de dois double: " + r3);

		// SUBTRAÇÃO

		r1 = int1 - int2;
		r2 = double1 - double2;
		r3 = int1 - double2;

		System.out.println("Subtracao de dois inteiros: " + r1);
		System.out.println("Subtracao de dois double: " + r2);
		System.out.println("Subtracao de dois double: " + r3);

		// MULTIPLICAÇÃO

		r1 = int1 * int2;
		r2 = double1 * double2;
		r3 = int1 * double2;

		System.out.println("Multiplicação de dois inteiros: " + r1);
		System.out.println("Multiplicação de dois double: " + r2);
		System.out.println("Multiplicação de dois double: " + r3);

		// DIVISÃO

		r1 = int1 / int3;
		r2 = double1 / double2;
		r3 = int1 / double2;

		System.out.println("Divisão de dois inteiros: " + r1);
		System.out.println("Divisão de dois double: " + r2);
		System.out.println("Divisão de dois double: " + r3);

		double r4 = int1 / (double) int3;

		System.out.println("Divisão de dois inteiros: " + r4);

		/*
		 * Em Java a divisão de dois inteiros sempre resultará em outro inteiro, a não
		 * ser que uma cast seja feito antes da divisão
		 */

		// RESTO DA DIVISÃO

		r1 = int1 % int3;
		r2 = double1 % double2;
		r3 = int1 % double2;

		System.out.println("Resto da divisão de dois inteiros: " + r1);
		System.out.println("Resto da divisão de dois double: " + r2);
		System.out.println("Resto da divisão de dois double: " + r3);

		// EXPONENSIAÇÃO

		int r44 = (int) Math.pow(10, 2);
		System.out.println("Exponensiação de dois double: " + r44);

		// EXEMPLOS DE OPERAÇÕESRELACIONAIS

		/*
		 * == != <= >= > <
		 * 
		 * System.out.println("hello" == 1); Java é fortemente tipado. Não há comparador
		 * de tipo como '===' igual no JavaScript pois ele não permite nem mesmo a
		 * compilação da expressão caso a verificação não seja valida
		 */

		// EXEMPLOS DE OPERAÇÕES COM STRINGS

		System.out.println(str1 + str2 + str3);
		System.out.println(str4 + double1);
		System.out.println("CASA é igual a cASA:" + (str1 == str5));
		System.out.println(str1.equals(str5));
		System.out.println(str1.equalsIgnoreCase(str5));
		System.out.println(str2.substring(2));
		System.out.println(str2.substring(2, 4));
		String str7 = double3 + "";
		str7 = String.valueOf(double3);
		System.out.println(str7);
		String str6 = String.valueOf(c1) + String.valueOf(c2) + String.valueOf(c3);
		System.out.println(str6);
		System.out.println(c1 + c2 + c3);
		System.out.println("" + c1 + c2 + c3);
		System.out.println(c1);
		System.out.println(str5.length());
		System.out.println(str2.indexOf("CO"));
		System.out.println(str2.indexOf("CD"));
		System.out.println(str2.startsWith("ES"));
		System.out.println(str2.endsWith("ES"));
		System.out.println(str2.contains("O") || str2.contains("X"));

	}
}

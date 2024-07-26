package metodos.desafio;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Alunos> lista = new ArrayList<Alunos>();

		// Testes
		testes(lista);
		// ******

		int op = 0;

		do {
			op = MenuSalaDeAula.menu();

			switch (op) {
			case 1: {
				MenuSalaDeAula.cadastrarAluno(lista);
				break;
			}
			case 2: {
				MenuSalaDeAula.listarAlunos(lista);
				break;
			}
			case 3: {
				MenuSalaDeAula.buscarAlunos(lista);
				break;
			}
			case 4: {
				MenuSalaDeAula.alunosAprovados(lista, 1);
				break;
			}
			case 5: {
				MenuSalaDeAula.alunosAprovados(lista, 2);
				break;
			}
			case 6: {
				MenuSalaDeAula.alunosAprovados(lista, 3);
				break;
			}
			}

		} while (op != 0);

	}
	
	public static void testes(ArrayList<Alunos> lista) {
		Alunos a = new Alunos();
		a.nome = "Maria";
		a.idade = 20;
		a.notas.add(10.0);
		lista.add(a);
		Alunos b = new Alunos();
		b.nome = "Joao Pedro";
		b.idade = 20;
		b.notas.add(2.0);
		lista.add(b);
		Alunos c = new Alunos();
		c.nome = "Nicolas";
		c.idade = 20;
		c.notas.add(10.0);

		lista.add(c);
		Alunos d = new Alunos();
		d.nome = "Roberto";
		d.idade = 20;
		d.notas.add(2.0);

		lista.add(d);
		Alunos e = new Alunos();
		e.nome = "Robinson";
		e.idade = 20;
		e.notas.add(10.0);

		lista.add(e);
		Alunos f = new Alunos();
		f.nome = "Andre";
		f.idade = 20;
		f.notas.add(4.0);

		lista.add(f);
		Alunos g = new Alunos();
		g.nome = "Ana";
		g.idade = 20;
		g.notas.add(5.0);

		lista.add(g);
		Alunos h = new Alunos();
		h.nome = "Julia";
		h.idade = 20;
		h.notas.add(3.0);

		lista.add(h);
		Alunos j = new Alunos();
		j.nome = "Joao Rodrigues";
		j.idade = 20;
		j.notas.add(10.0);

		lista.add(j);
	}

}

package aplicacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pessoa implements Impressao {
	private String nome;
	private Integer idade;
	private List<Telefone> telefone;
	private Sexo sexo;

	public Pessoa(String nome, Integer idade, List<Telefone> telefone, Sexo sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.sexo = sexo;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone.toString() + ", Sexo: " + sexo
				+ "]";
	}

	public static Pessoa lerDados() {
		Pessoa pessoa = new Pessoa();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o seu nome: ");
		pessoa.setNome(scan.next());

		System.out.println("Informe a sua idade: ");
		pessoa.setIdade(scan.nextInt());

		System.out.println("Informe o seu sexo: ");
		for (Sexo sexo : Sexo.values()) {
			System.out.println(sexo.getId() + " " + sexo.getNome());
		}

		pessoa.setSexo(Sexo.valueOf(scan.nextInt()));

		System.out.println("Deseja cadastrar algum telefone? ".concat("1 - SIM - 2 - NÃO"));
		if (scan.nextInt() == 1) {
			scan.nextLine();
			System.out.println("Informe quantos telefones você quer cadastrar: ");
			int qntd = scan.nextInt();

			scan.nextLine();

			pessoa.setTelefone(new ArrayList<Telefone>(qntd));

			for (int i = 0; i < qntd; i++) {
				pessoa.getTelefone().add(Telefone.lerDados());
			}

		} else {
			pessoa.setTelefone(new ArrayList<Telefone>());
		}

		return pessoa;
	}

	public static void imprimirLista(List<Pessoa> lista) {
		System.out.println("Todas os dados");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}
	}

	public static void imprimirLista(List<Pessoa> lista, Sexo sexo) {
		System.out.println("Apenas as pessoas de Sexo Masculino: ");
		lista.stream().filter(pessoas -> pessoas.getSexo().equals(Sexo.valueOf(1)))
				.forEach(pessoas -> System.out.println(pessoas));

	}

	public static void imprimirListaOrdenadaPorNome(List<Pessoa> lista) {
		System.out.println("Classe anônima - Dados ordenados por nome: ");

		lista.sort(new Comparator<Pessoa>() {
		
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}

	}

	public static void imprimirListaOrdenadaPorIdade(List<Pessoa> lista) {
		System.out.println("Classe anônima - Dados ordenados por Idade: ");

		lista.sort(new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getIdade().compareTo(o2.getIdade());
			}

		});

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}

	public static void imprimirListaOrdenadaPorSexo(List<Pessoa> lista) {
		System.out.println("Classe anônima - Dados ordenados pelo Sexo: ");

		lista.sort(new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getSexo().compareTo(o2.getSexo());
			}

		});

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}

	public static void imprimirListaOrdenadaPorNomeExpressaoLambda(List<Pessoa> lista) {
		System.out.println("Expressão Lambda - Dados ordenados por nome: ");

		lista.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}

	}

	public static void imprimirListaOrdenadaPorIdadeExpressaoLambda(List<Pessoa> lista) {
		System.out.println("Expressão Lambda - Dados ordenados por Idade: ");

		lista.sort((o1, o2) -> o1.getIdade().compareTo(o2.getIdade()));

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}

	public static void imprimirListaOrdenadaPorSexoExpressaoLambda(List<Pessoa> lista) {
		System.out.println("Expressão Lambda - Dados ordenados pelo Sexo: ");

		lista.sort((o1, o2) -> o1.getSexo().compareTo(o2.getSexo()));

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}
}

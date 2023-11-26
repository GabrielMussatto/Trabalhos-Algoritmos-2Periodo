package modelo;

import java.util.List;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String cpf;
	private Sexo sexo;
	
	
	public Pessoa(String nome, String cpf, Sexo sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	public Pessoa() {
		
	}
	
	public static Pessoa lerDados() {
		Pessoa pessoa = new Pessoa();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o nome: ");
		pessoa.setNome(scan.next());
		
		System.out.println("Informe o cpf: ");
		pessoa.setCpf(scan.next());
		
		System.out.println("Informe o sexo: MASCULINO ou FEMININO");
		String receberSexo = scan.next();
		pessoa.setSexo(Sexo.valueOf(receberSexo));
		return pessoa;
	}
	
	public static void imprimirTudo(List<Pessoa> lista) {
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Sexo: " + sexo;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}

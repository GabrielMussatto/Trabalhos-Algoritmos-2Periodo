package aplicacao4;

import heranca.Pessoa;
import heranca.PessoaFisica;
import heranca.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(1, "Jorge", "jorge@gmail.com");
		PessoaFisica pessoaF = new PessoaFisica(2, "Zico", "zico@gmail.com", "523.956.794-00", "(11) 99885-4581");
		PessoaJuridica pessoaJ = new PessoaJuridica(3, "Flamengo", "flamengo@empresa.com", "12.345.678/0001-90",
				"12345", "(11) 1234-5678");

		imprimir(pessoa);
		imprimir(pessoaF);
		imprimir(pessoaJ);
	}

	public static void imprimir(Pessoa pessoa) {
		if (pessoa instanceof PessoaFisica) {
			System.out.println("Dados da Pessoa Física:");
			System.out.println("ID: " + ((PessoaFisica) pessoa).getId());
			System.out.println("Nome: " + ((PessoaFisica) pessoa).getNome());
			System.out.println("Email: " + ((PessoaFisica) pessoa).getEmail());
			System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
			System.out.println("Telefone: " + ((PessoaFisica) pessoa).getTelefone());
			System.out.println();
		} else if (pessoa instanceof PessoaJuridica) {
			System.out.println("Dados da Pessoa Jurídica:");
			System.out.println("ID: " + ((PessoaJuridica) pessoa).getId());
			System.out.println("Nome: " + ((PessoaJuridica) pessoa).getNome());
			System.out.println("Email: " + ((PessoaJuridica) pessoa).getEmail());
			System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());
			System.out.println("Inscrição Estadual: " + ((PessoaJuridica) pessoa).getInscricaoEstadual());
			System.out.println("Telefone Fixo: " + ((PessoaJuridica) pessoa).getTelefoneFixo());
			System.out.println();
		} else {
			System.out.println("Dados da Pessoa:");
			System.out.println("ID: " + pessoa.getId());
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Email: " + pessoa.getEmail());
			System.out.println();
		}
	}

}

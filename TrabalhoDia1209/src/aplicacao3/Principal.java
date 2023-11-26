package aplicacao3;

import heranca.Pessoa;
import heranca.PessoaFisica;
import heranca.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(1, "cleber", "cleber@gmail.com");
		PessoaFisica pessoaF = new PessoaFisica(2, "João", "joao@gmail.com", "893.126.259-00", "(63) 98782-4849");
		PessoaJuridica pessoaJ = new PessoaJuridica(3, "Toddy", "Toddy@gmail.com", "22.395.688/0001-90", "12345",
				"(11) 3475-5884");

		pessoa.imprimir();
		System.out.println();
		pessoaF.imprimir();
		System.out.println();
		pessoaJ.imprimir();

	}

}

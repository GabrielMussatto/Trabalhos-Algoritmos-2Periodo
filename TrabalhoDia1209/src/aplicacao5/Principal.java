package aplicacao5;

import heranca.Pessoa;
import heranca.PessoaFisica;
import heranca.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(1, "João", "joao@gmail.com");
		PessoaFisica pessoaFisica = new PessoaFisica(2, "Santos", "santos@gmail.com", "173.646.781-00",
				"(63) 98775-4951");
		PessoaJuridica pessoaJuridica = new PessoaJuridica(3, "DAF", "daf@gmail.com", "12.345.678/0001-90", "12345",
				"(63) 3354-5848");

		System.out.println("Dados da Pessoa:");
		System.out.println(pessoa.toString());

		System.out.println("\nDados da Pessoa Física:");
		System.out.println(pessoaFisica.toString());

		System.out.println("\nDados da Pessoa Jurídica:");
		System.out.println(pessoaJuridica.toString());

		PessoaFisica pessoaFisica2 = new PessoaFisica(4, "Maria", "maria@gmail.com", "183.476.789-01",
				"(63) 98775-8921");
		System.out.println("\nComparando PessoaFisica com PessoaFisica2:");
		System.out.println(pessoaFisica.equals(pessoaFisica2));

		PessoaJuridica pessoaJuridica2 = new PessoaJuridica(3, "DAF", "daf@gmail.com", "12.345.678/0001-90", "12345",
				"(63) 3354-5848");
		System.out.println("\nComparando PessoaJuridica com PessoaJuridica2:");
		System.out.println(pessoaJuridica.equals(pessoaJuridica2));
	}

}

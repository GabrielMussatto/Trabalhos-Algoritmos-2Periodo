package heranca;

import java.util.Objects;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String telefone;

	public PessoaFisica(Integer id, String nome, String email, String cpf, String telefone) {
		super(id, nome, email);
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Cpf: " + getCpf());
		System.out.println("Telefone: " + getTelefone());
	}

	@Override
	public String toString() {
		return "PessoaFisica [Id: " + getId() + ", Nome: " + getNome() + ", Email: " + getEmail() + ", CPF: " + getCpf()
				+ ", Telefone: " + getTelefone() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(telefone, other.telefone);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cpf, telefone);
		return result;
	}

}

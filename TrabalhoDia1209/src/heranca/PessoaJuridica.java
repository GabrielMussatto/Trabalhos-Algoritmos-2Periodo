package heranca;

import java.util.Objects;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String inscricaoEstadual;
	private String telefoneFixo;

	public PessoaJuridica(Integer id, String nome, String email, String cnpj, String inscricaoEstadual,
			String telefoneFixo) {
		super(id, nome, email);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.telefoneFixo = telefoneFixo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("CNPJ: " + getCnpj());
		System.out.println("Inscrição Estadual: " + getInscricaoEstadual());
		System.out.println("Telefone Fixo: " + getTelefoneFixo());
	}

	@Override
	public String toString() {
		return "PessoaJuridica [Id: " + getId() + ", Nome: " + getNome() + ", Email: " + getEmail() + ", CNPJ: "
				+ getCnpj() + ", Inscrição Estadual: " + getInscricaoEstadual() + ", Telefone Fixo: "
				+ getTelefoneFixo() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cnpj, inscricaoEstadual, telefoneFixo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(inscricaoEstadual, other.inscricaoEstadual)
				&& Objects.equals(telefoneFixo, other.telefoneFixo);
	}

}

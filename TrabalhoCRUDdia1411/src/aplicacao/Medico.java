package aplicacao;

public class Medico {
	private String nome;
	private String especialidade;

	public Medico(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Médico [Nome: " + nome + ", Especialidade: " + especialidade + "]";
	}

	public Medico() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}

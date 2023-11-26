package aplicacao;

public enum Sexo {
	MASCULINO(1, "Masculino"), 
	FEMININO(2, "Feminino");

	private int id;
	private String nome;

	private Sexo(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public static Sexo valueOf(int opcao) {
		for (Sexo sexo : Sexo.values()) {
			if (sexo.getId() == opcao) {
				return sexo;
			}
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

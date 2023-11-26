package aplicacao;

public enum Instituicao {
	PUBLICA(1, "Pública"),
	PARTICULAR(2, "Particular");

	private int id;
	private String descricao;

	private Instituicao(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static Instituicao valueOf(int opcao) {
		for (Instituicao instituicao : Instituicao.values()) {
			if (instituicao.getId() == opcao) {
				return instituicao;
			}
		}
		return null;
	}
	
}

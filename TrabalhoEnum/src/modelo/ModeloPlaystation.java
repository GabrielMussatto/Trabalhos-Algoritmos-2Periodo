package modelo;

public enum ModeloPlaystation {
	PS1(1, "PlayStation 1"),
	PS2(2, "PlayStation 2"),
	PS3(3, "PlayStation 3"),
	PS4(4, "PlayStation 4"),
	PS5(5, "PlayStation 5");

	private final int id;
	private final String descricao;

	private ModeloPlaystation(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
}

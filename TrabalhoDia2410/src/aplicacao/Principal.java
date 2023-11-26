package aplicacao;

import java.util.ArrayList;
import java.util.List;

import modelo.Pessoa;
import modelo.Sexo;

public class Principal {

	public static void main(String[] args) {
		List <Pessoa> lista = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			lista.add(Pessoa.lerDados());
		}
		
		Pessoa.imprimirTudo(lista);
		
		List <Pessoa> copiaLista = new ArrayList<>(lista);
		
		for (Pessoa pessoa : copiaLista) {
			if((pessoa.getSexo() == Sexo.MASCULINO))
				lista.remove(lista.indexOf(pessoa));
		}
		
		Pessoa.imprimirTudo(lista);
	}

}

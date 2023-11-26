package aplicacao;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List <Pessoa>lista = new ArrayList<Pessoa>();
		for (int i = 0; i < 5; i++) {
			lista.add(Pessoa.lerDados());
			System.out.println();
			
		}
		
		Pessoa.imprimirLista(lista);
		System.out.println();
		
		Pessoa.imprimirLista(lista, Sexo.valueOf(1));
		System.out.println();
		
		Pessoa.imprimirListaOrdenadaPorNome(lista);
		System.out.println();
		
		Pessoa.imprimirListaOrdenadaPorIdade(lista);
		System.out.println();
		
		Pessoa.imprimirListaOrdenadaPorSexo(lista);
		System.out.println();
		
		Pessoa.imprimirListaOrdenadaPorNomeExpressaoLambda(lista);
		System.out.println();
		
		Pessoa.imprimirListaOrdenadaPorIdadeExpressaoLambda(lista);
		System.out.println();
	
		Pessoa.imprimirListaOrdenadaPorSexoExpressaoLambda(lista);
	}
}

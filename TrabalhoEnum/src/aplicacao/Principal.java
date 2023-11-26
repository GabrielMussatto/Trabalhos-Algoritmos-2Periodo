package aplicacao;

import java.util.Scanner;
import modelo.LojaPlaystation;

public class Principal {

	public static void main(String[] args) {
		LojaPlaystation loja = new LojaPlaystation();
		Scanner scan = new Scanner(System.in);
		int opcao;

		System.out.println("Seja Bem-Vindo a Loja de Playstation");
		System.out.println("Estamos localizados na " + loja.getEndereco());

		do {
			System.out.println("\nMenu:");
			System.out.println("0 - Encerrar Sistema");
			System.out.println("1 - Realizar uma Compra");
			System.out.println("2 - Listar Todas as Vendas no Sistema");
			System.out.println("\nEscolha uma opção: ");
			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Encerrando o Sistema...");
				break;
			case 1:
				loja.lerDados();
				break;
			case 2:
				loja.listarVendas();
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
			}
		} while (opcao != 0);
	}

}

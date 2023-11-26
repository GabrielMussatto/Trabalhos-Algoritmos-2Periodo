package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner (System.in);
		
		do {
			Hospital.menu();
			opcao = scan.nextInt();
			
			switch(opcao){
			case 1:
				Hospital.cadastrarHospital();
				break;
			case 2:
				Hospital.alterarHospital();
				break;
			case 3:
				Hospital.excluirHospital();
				break;
			case 4:
				Hospital.listarHospital();
				break;
			case 0:
				System.out.println("Encerrando o sistema!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente!");
				break;
			}
			
		}while(opcao != 0);

	}

}

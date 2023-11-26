package aplicacao;

import java.util.Scanner;

public class Telefone implements Impressao {
	private String codigoArea;
	private String numero;

	@Override
	public String toString() {
		return "Telefone [Codigo de Area: " + codigoArea + ", Numero: " + numero + "]";
	}

	@Override
	public void imprimir() {
		
	}

	public static Telefone lerDados() {
		Telefone telefone = new Telefone();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o codigo de area: ");
		telefone.setCodigoArea(scan.nextLine());

		System.out.println("Informe o numero: ");
		telefone.setNumero(scan.nextLine());

		return telefone;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}

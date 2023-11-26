package aplicacao2;

import modelo1e2.Matematica;

public class Principal {

	public static void main(String[] args) {
		Matematica operacao = new Matematica();

		System.out.println("Questão 2");
		System.out.println("Multiplicar");
		System.out.println(operacao.multiplicar2(5, 7.5f));
		System.out.println(operacao.multiplicar2(2.7f, 9.3d));
		System.out.println(operacao.multiplicar2(6117654L, 8));
		System.out.println(operacao.multiplicar2(7, 3.7D));

		System.out.println("\nDividir");
		System.out.println(operacao.dividir2(8, 2.2f));
		System.out.println(operacao.dividir2(19.4f, 2.5d));
		System.out.println(operacao.dividir2(464325L, 9));
		System.out.println(operacao.dividir2(36, 4.2D));

		System.out.println("\nSubtrair");
		System.out.println(operacao.subtrair2(10, 5.7f));
		System.out.println(operacao.subtrair2(7.8f, 3.6d));
		System.out.println(operacao.subtrair2(69164658L, 68186));
		System.out.println(operacao.subtrair2(681454, 6185D));

	}

}

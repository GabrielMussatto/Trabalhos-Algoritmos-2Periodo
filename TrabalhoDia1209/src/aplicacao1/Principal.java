package aplicacao1;

import modelo1e2.Matematica;

public class Principal {

	public static void main(String[] args) {
		Matematica operacao = new Matematica();

		System.out.println("Somas:");
		System.out.println(operacao.somar(7, 5));
		System.out.println(operacao.somar(3, 7.9d));
		System.out.println(operacao.somar(43.2d, 32.9d));
		System.out.println("\nSubtrações:");
		System.out.println(operacao.subtrair(8, 9));
		System.out.println(operacao.subtrair(2, 1.5d));
		System.out.println(operacao.subtrair(3.9d, 1.64d));
		System.out.println("\nMultiplicações:");
		System.out.println(operacao.multiplicar(21, 4));
		System.out.println(operacao.multiplicar(12, 2.6d));
		System.out.println(operacao.multiplicar(1.9d, 6.3d));
		System.out.println("\nDivisões:");
		System.out.println(operacao.dividir(90, 20));
		System.out.println(operacao.dividir(107, 2.5d));
		System.out.println(operacao.dividir(175.5d, 10.5d));

	}

}

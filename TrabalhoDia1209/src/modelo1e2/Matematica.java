package modelo1e2;

public class Matematica {
	// Metodos de soma
	public int somar(int valor1, int valor2) {
		return valor1 + valor2;
	}

	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public double somar(int valor1, double valor2) {
		return valor1 + valor2;
	}

	// Metodos de subtração
	public int subtrair(int valor1, int valor2) {
		return valor1 - valor2;
	}

	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}

	public double subtrair(int valor1, double valor2) {
		return valor1 - valor2;
	}

	// Metodos de multiplicação
	public int multiplicar(int valor1, int valor2) {
		return valor1 * valor2;
	}

	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public double multiplicar(int valor1, double valor2) {
		return valor1 * valor2;
	}

	// Metodos de divisão
	public int dividir(int valor1, int valor2) {
		return valor1 / valor2;
	}

	public double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}

	public double dividir(int valor1, double valor2) {
		return valor1 / valor2;
	}

	// Questao dois
	public int multiplicar2(int num1, float num2) {
		return num1 * (int) num2;
	}

	public int multiplicar2(float num1, double num2) {
		return (int) num1 * (int) num2;
	}

	public int multiplicar2(long num1, int num2) {
		return (int) num1 * num2;
	}

	public int multiplicar2(int num1, Double num2) {
		return num1 * Integer.parseInt(num2.toString());
	}

	public int dividir2(int num1, float num2) {
		return num1 / (int) num2;
	}

	public int dividir2(float num1, double num2) {
		return (int) num1 / (int) num2;
	}

	public int dividir2(long num1, int num2) {
		return (int) num1 / num2;
	}

	public int dividir2(int num1, Double num2) {
		return num1 / Integer.parseInt(num2.toString());
	}

	public int subtrair2(int num1, float num2) {
		return num1 - (int) num2;
	}

	public int subtrair2(float num1, double num2) {
		return (int) num1 - (int) num2;
	}

	public int subtrair2(long num1, int num2) {
		return (int) num1 - num2;
	}

	public int subtrair2(int num1, Double num2) {
		return num1 - Integer.parseInt(num2.toString());
	}

}

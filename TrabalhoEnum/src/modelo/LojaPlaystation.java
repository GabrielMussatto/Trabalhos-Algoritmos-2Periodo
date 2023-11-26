package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LojaPlaystation {
	private String endereco;
	private String[] nomesClientes = new String[3];
	private ModeloPlaystation[] modelosVendidos = new ModeloPlaystation[3];
	private LocalDate dataCompra = LocalDate.now();
	private String dataFormatada = dataCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	private int vendasRealizadas = 0;

	public LojaPlaystation() {

	}

	public void lerDados() {
		Scanner scan = new Scanner(System.in);

		if (vendasRealizadas >= nomesClientes.length) {
			System.out.println("Limite de compras atingido.");
			return;
		}

		System.out.println("\nInforme o nome do cliente: ");
		nomesClientes[vendasRealizadas] = scan.next();

		System.out.println("Informe o modelo que você deseja comprar: ");
		for (ModeloPlaystation modeloPlaystation : ModeloPlaystation.values()) {
			System.out.println(modeloPlaystation.getId() + " - " + modeloPlaystation.getDescricao());
		}

		int modeloSelecionado = scan.nextInt();

		for (ModeloPlaystation modeloPlaystation : ModeloPlaystation.values()) {
			if (modeloPlaystation.getId() == modeloSelecionado) {
				modelosVendidos[vendasRealizadas] = modeloPlaystation;
				vendasRealizadas++;
				break;
			}
		}
	}

	public void listarVendas() {
		System.out.println("\nLista de Todas as Vendas:");
		for (int i = 0; i <= vendasRealizadas; i++) {
			System.out.println("Nome Cliente: " + nomesClientes[i] + ", Modelo Vendido: "
					+ modelosVendidos[i].getDescricao() + ", Data da Venda: " + getDataFormatada());
		}
	}

	public String getEndereco() {
		return endereco = "108 Norte em frente ao Açai.com";
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String[] getNomesClientes() {
		return nomesClientes;
	}

	public void setNomesClientes(String[] nomesClientes) {
		this.nomesClientes = nomesClientes;
	}

	public ModeloPlaystation[] getModelosVendidos() {
		return modelosVendidos;
	}

	public void setModelosVendidos(ModeloPlaystation[] modelosVendidos) {
		this.modelosVendidos = modelosVendidos;
	}

	public String getDataFormatada() {
		return dataFormatada;
	}

	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}

	public int getVendasRealizadas() {
		return vendasRealizadas;
	}

	public void setVendasRealizadas(int vendasRealizadas) {
		this.vendasRealizadas = vendasRealizadas;
	}

}
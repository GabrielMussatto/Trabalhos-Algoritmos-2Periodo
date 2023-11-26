package aplicacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hospital {

	private String nomeH;
	private String endereco;
	private String email;
	private Instituicao instituicao;
	private List<Medico> medicos;
	private static Map<String, Hospital> hospitalMap = new HashMap<>();
	private static Scanner scan = new Scanner(System.in);

	public Hospital(String nomeH, String endereco, String email, Instituicao instituicao, List<Medico> medicos) {
		super();
		this.nomeH = nomeH;
		this.endereco = endereco;
		this.email = email;
		this.instituicao = instituicao;
		this.medicos = medicos;
	}

	public Hospital() {

	}

	public static void menu() {
		System.out.println("Seja Bem-Vindo ao nosso Sistema");
		System.out.println("1 - Cadastrar Hospital");
		System.out.println("2 - Alterar Hospital");
		System.out.println("3 - Excluir Hospital");
		System.out.println("4 - Listar Hospitais");
		System.out.println("0 - Encerrar Sistema");
		System.out.println("Escolha uma opção: ");
	}

	public static void cadastrarHospital() {
		Hospital hospital = new Hospital();

		System.out.println("Informe o nome do Hospital: ");
		hospital.setNomeH(scan.nextLine());

		System.out.println("Informe o endereço do Hospital: ");
		hospital.setEndereco(scan.nextLine());

		System.out.println("Informe o email do Hospital: ");
		hospital.setEmail(scan.nextLine());

		System.out.println("Informe a Instituição do Hospital");
		for (Instituicao instituicao : Instituicao.values()) {
			System.out.println(instituicao.getId() + " - " + instituicao.getDescricao());
		}

		hospital.setInstituicao(Instituicao.valueOf(scan.nextInt()));

		List<Medico> medicos = new ArrayList<>();
		System.out.println("Informe o número de Médicos do Hospital: ");
		int numMedicos = scan.nextInt();

		for (int i = 0; i < numMedicos; i++) {
			System.out.println("Informe o nome do Médico " + (i + 1) + ": ");
			String nomeMedico = scan.next();
			System.out.println("Informe a especialidade do Médico " + (i + 1) + ": ");
			String especialidadeMedico = scan.next();
			medicos.add(new Medico(nomeMedico, especialidadeMedico));
		}

		hospital.setMedicos(medicos);

		hospitalMap.put(hospital.getNomeH(), hospital);
		System.out.println("O Hospital foi cadastrado com sucesso!!");
	}

	public static void alterarHospital() {
	    int tentativas = 3;
	    boolean nomeValido = false;

	    while (tentativas >= 0 && !nomeValido) {
	        try {
	            System.out.println("Informe o nome do Hospital a ser alterado: ");
	            String nome = scan.nextLine();

	            if (!hospitalMap.containsKey(nome)) {
	                System.out.println("Hospital não encontrado! Tente novamente. Você tem " + tentativas + " Tentativas");
	                tentativas--;
	            } else {
	                Hospital novoHospital = new Hospital();

	                System.out.println("Informe o nome do Hospital: ");
	                novoHospital.setNomeH(scan.nextLine());

	                System.out.println("Informe o endereço do Hospital: ");
	                novoHospital.setEndereco(scan.nextLine());

	                System.out.println("Informe o email do Hospital: ");
	                novoHospital.setEmail(scan.nextLine());

	                System.out.println("Informe a Instituição do Hospital");
	                for (Instituicao instituicao : Instituicao.values()) {
	                    System.out.println(instituicao.getId() + " - " + instituicao.getDescricao());
	                }
	                novoHospital.setInstituicao(Instituicao.valueOf(scan.nextInt()));

	                List<Medico> medicos = new ArrayList<>();
	                System.out.println("Informe o número de Médicos do Hospital: ");
	                int numMedicos = scan.nextInt();

	                for (int i = 0; i < numMedicos; i++) {
	                    System.out.println("Informe o nome do Médico " + (i + 1) + ": ");
	                    String nomeMedico = scan.next();
	                    System.out.println("Informe a especialidade do Médico " + (i + 1) + ": ");
	                    String especialidadeMedico = scan.next();
	                    medicos.add(new Medico(nomeMedico, especialidadeMedico));
	                }

	                novoHospital.setMedicos(medicos);

	                hospitalMap.replace(nome, novoHospital);
	                System.out.println("O Hospital foi alterado com sucesso!!");
	                nomeValido = true;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Erro de entrada: Por favor, insira um valor válido.");
	            scan.nextLine(); //limpando o buffer do scanner
	            tentativas--;
	        }
	    }

	    if (!nomeValido) {
	        System.out.println("Limite de tentativas excedido. Voltando ao menu.");
	    }
	}

	public static void excluirHospital() {
	    int tentativas = 3;
	    boolean nomeValido = false;

	    while (tentativas >= 0 && !nomeValido) {
	        try {
	            System.out.println("Informe o nome do Hospital para ser excluído: ");
	            String nome = scan.next();

	            if (!hospitalMap.containsKey(nome)) {
	                System.out.println("Hospital não encontrado! Tente novamente. Você tem " + tentativas + " Tentativas.");
	                tentativas--;
	            } else {
	                hospitalMap.remove(nome);
	                System.out.println("Hospital excluído com sucesso!");
	                nomeValido = true;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Erro de entrada: Por favor, insira um valor válido.");
	            scan.nextLine(); // limpando o buffer do scanner
	            tentativas--;
	        }
	    }

	    if (!nomeValido) {
	        System.out.println("Limite de tentativas excedido. Voltando ao menu.");
	    }
	}

	public static void listarHospital() {
		if (hospitalMap.isEmpty()) {
			System.out.println("Nenhum Hospital cadastrado!");
		} else {
			List<Hospital> hospitalOrdenados = new ArrayList<>(hospitalMap.values());
			
			hospitalOrdenados.sort((o1, o2) -> o1.getNomeH().compareTo(o2.getNomeH()));
			
			System.out.println("Lista de Hospitais ordenados por nome: ");
			
			hospitalOrdenados.forEach(hospitais -> System.out.println(hospitais));
			
		}
	}

	@Override
	public String toString() {
		return "Hospital [nome=" + nomeH + ", endereco=" + endereco + ", email=" + email + ", instituicao=" + instituicao.getDescricao()
				+ ", Médicos: " + medicos.toString() + "]";
	}

	public String getNomeH() {
		return nomeH;
	}

	public void setNomeH(String nomeH) {
		this.nomeH = nomeH;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}

	public Map<String, Hospital> getHospitalMap() {
		return hospitalMap;
	}

	public void setHospitalMap(Map<String, Hospital> hospitalMap) {
		this.hospitalMap = hospitalMap;
	}

}

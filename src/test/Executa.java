package test;

import model.Pessoa;

public class Executa {
	public static void main(String[] args) {

		Pessoa crianca = new Pessoa("João", "36.495.444-X");
		Pessoa adulto = new Pessoa("Maria", "36.495.444-4", "433.760.268-23");

		System.out.println("Nome: " + crianca.getNome());
		System.out.println("RG: " + crianca.getRg());
		System.out.println("CPF: " + crianca.getCpf());
		System.out.println("--");
		System.out.println("Nome: " + adulto.getNome());
		System.out.println("RG: " + adulto.getRg());
		System.out.println("CPF: " + adulto.getCpf());
		System.out.println("--");
		System.out.println("A pessoa não é mais criança");
		crianca.setCpf("455.750.285-23");
		System.out.println("CPF: " + crianca.getCpf());

	}
}

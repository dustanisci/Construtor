package model;

public class Pessoa {
	String nome;
	String cpf;
	String rg;
	String genero;
	
//	Construtor padrao
	public Pessoa() {
		
	}
	
//	Construtor crianca
	public Pessoa(String nome, String rg){
		this.nome = nome;
		this.rg = rg;
		this.cpf = "Não há";
	}
	
//	Construtor adulto
	public Pessoa(String nome, String rg, String cpf) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}

package br.senac.pr;

public class Cliente {
	String cpf;
	int anoNascimento;
	String nome;
	String email;
	
public Cliente(String cpf, int anoNascimento, String nome, String email) {
		super();
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
		this.email = email;
	}
}

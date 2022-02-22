package br.senac.pr;

public class Cliente {
	String cpf;
	int anoNascimento;
	String nome;
	String email;

public String retornaCliente() {
	// TODO Auto-generated method stub
	return "[Nome: " + this.nome + ", CPF: " + this.cpf + " - Ano de Nascimento: " + this.anoNascimento + " - Email: " + this.email + "]";
}

}

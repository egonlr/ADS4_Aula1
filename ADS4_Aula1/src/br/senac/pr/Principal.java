package br.senac.pr;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int conta;
		float saldo;

		Cliente cliente_01 = new Cliente();
		Cliente cliente_02 = new Cliente();
		Cliente cliente_03 = new Cliente();
		Cliente cliente_04 = new Cliente();
 		
//		cliente_01.nome = "Marcos da Rocha Souza";
//		cliente_01.cpf = "02850435902";
//		cliente_01.anoNascimento = 1980;
//		cliente_01.email = "mr_souza@gmail.com";
//		
//		cliente_02.nome = "Ana Clara Marques";
//		cliente_02.cpf = "03510400902";
//		cliente_02.anoNascimento = 1985;
//		cliente_02.email = "aninha@gmail.com";
//		
//		cliente_03.nome = "Pedro de Alcantara";
//		cliente_03.cpf = "04564238906";
//		cliente_03.anoNascimento = 1975;
//		cliente_03.email = "pedro_75@gmail.com";
//		
//		cliente_04.nome = "Ana Clara Marques";
//		cliente_04.cpf = "03510400902";
//		cliente_04.anoNascimento = 1985;
//		cliente_04.email = "aninha@gmail.com";
		
		//Leitura e criação de clientes
		System.out.println("Cliente 1:");
		
		System.out.println("Nome: ");
		cliente_01.nome = sc.nextLine();
		
		System.out.println("Cpf: ");
		cliente_01.cpf = sc.nextLine();
		
		System.out.println("Ano de Nascimento: ");
		cliente_01.anoNascimento = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Email: ");
		cliente_01.email = sc.nextLine();
		
		System.out.println("Cliente 2:");
		
		System.out.println("Nome: ");
		cliente_02.nome = sc.nextLine();
		
		System.out.println("Cpf: ");
		cliente_02.cpf = sc.nextLine();
		
		System.out.println("Ano de Nascimento: ");
		cliente_02.anoNascimento = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Email: ");
		cliente_02.email = sc.nextLine();
		
		System.out.println("Cliente 3:");
		
		System.out.println("Nome: ");
		cliente_03.nome = sc.nextLine();
		
		System.out.println("Cpf: ");
		cliente_03.cpf = sc.nextLine();
		
		System.out.println("Ano de Nascimento: ");
		cliente_03.anoNascimento = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Email: ");
		cliente_03.email = sc.nextLine();
		
		System.out.println("Cliente 4:");
		
		System.out.println("Nome: ");
		cliente_04.nome = sc.nextLine();
		
		System.out.println("Cpf: ");
		cliente_04.cpf = sc.nextLine();
		
		System.out.println("Ano de Nascimento: ");
		cliente_04.anoNascimento = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Email: ");
		cliente_04.email = sc.nextLine();
				
		
		//Leitura e criacao de Contas
		System.out.println("Conta 1 ------------>");
		System.out.println("Conta: ");
		conta = sc.nextInt();
		
		System.out.println("Saldo: ");
		saldo = sc.nextFloat();

		Conta conta_01 = new Conta(conta, saldo);
		
		System.out.println("Conta 2 ------------>");
		System.out.println("Conta: ");
		conta = sc.nextInt();
		
		System.out.println("Saldo: ");
		saldo = sc.nextFloat();

		Conta conta_02 = new Conta(conta, saldo);
		
		System.out.println("Conta 3 ------------>");
		System.out.println("Conta: ");
		conta = sc.nextInt();
		
		System.out.println("Saldo: ");
		saldo = sc.nextFloat();

		Conta conta_03 = new Conta(conta, saldo);
		
		System.out.println("Conta 4 ------------>");
		System.out.println("Conta: ");
		conta = sc.nextInt();
		
		System.out.println("Saldo: ");
		saldo = sc.nextFloat();

		Conta conta_04 = new Conta(conta, saldo);
		
		System.out.println("Conta 5 ------------>");
		System.out.println("Conta: ");
		conta = sc.nextInt();
		
		System.out.println("Saldo: ");
		saldo = sc.nextFloat();

		Conta conta_05 = new Conta(conta, saldo);
		
		System.out.println("Conta 6 ------------>");
		System.out.println("Conta: ");
		conta = sc.nextInt();
		
		System.out.println("Saldo: ");
		saldo = sc.nextFloat();

		Conta conta_06 = new Conta(conta, saldo);
		

		
		
		//testa método retornaCliente
		System.out.println(cliente_01.retornaCliente());
		System.out.println(cliente_04.retornaCliente());
		
		//testa método retronaConta
		System.out.println(conta_01.retornaConta());
		System.out.println(conta_06.retornaConta());
		
		//testa método debitaSaldo
		
		conta_01.debitaSaldo(100.00f);
		System.out.println(conta_01.retornaConta());
		
		
		//testa método creditaSaldo
		conta_02.creditaSaldo(1000.0f);
		System.out.println(conta_02.retornaConta());
		
		
		
	}
}

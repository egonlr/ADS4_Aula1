package br.senac.pr;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente_01 = new Cliente("02850435902", 1980, "Marcos da Rocha Souza", "mr_souza@gmail.com");
		Cliente cliente_02 = new Cliente("03510400902", 1985, "Ana Clara Marques", "aninha@gmail.com");
		Cliente cliente_03 = new Cliente("04564238906", 1975, "Pedro de Alcantara", "pedro_75@gmail.com");
		Cliente clienet_04 = new Cliente("03510400902", 1985, "Ana Clara Marques", "aninha@gmail.com");
		
		Conta conta_01 = new Conta(1521, 750.63f);
		Conta conta_02 = new Conta(1314, 10.36f);
		Conta conta_03 = new Conta(2368, 1523.00f);
		Conta conta_04 = new Conta(3568, -50.45f);
		Conta conta_05 = new Conta(2224, 91.23f);
		Conta conta_06 = new Conta(1019, -70.35f);

	}

}

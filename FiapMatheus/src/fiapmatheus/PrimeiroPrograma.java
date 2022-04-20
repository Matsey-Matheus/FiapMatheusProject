package fiapmatheus;

import java.util.Scanner;

import java.util.Random;

public class PrimeiroPrograma {

	public static void main(String[] args) { 
		
		// Nome e Idade
		
		System.out.println("---------------------");
		System.out.println(" Informações Basicas ");
		System.out.println("---------------------");
		System.out.println("");
		System.out.print("Digite seu nome: ");
		Scanner name = new Scanner(System.in);
		String Nome = name.nextLine();
		System.out.print("Digite o ano que vc nasceu: ");
		Scanner age = new Scanner(System.in);
		int Idade = age.nextInt();
		
		int numberMinimo = 1940;
		int numberMaximo = 2022;		
		
		if (Idade >= numberMinimo && Idade <= numberMaximo) {

			int IdadeConta = 2022 - Idade;
			
			System.out.println("Olá " + Nome + ", você tem " + IdadeConta + " anos.");
			System.out.println("");
			
			// UserName e Senha
			
			SenhaCorreta senhaCorreta = new SenhaCorreta();
			
			String senhaPrimeira = senhaCorreta.SistemaLogin();
			
			 }
		 
		else {
			
			System.out.println("Digite um ano valido.");
			
		}
	
	}

}

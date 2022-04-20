package fiapmatheus;

import java.util.Scanner;

public class SenhaCorreta {
	
	public String SistemaLogin() {
	
		System.out.println("-------------");
		System.out.println("  Registro: ");
		System.out.println("-------------");
		System.out.println("");
		System.out.print("Username: ");
		
		Variaveis userNameEntrada = new Variaveis();
		
		String nomeDeUsuario = userNameEntrada.userNameSalvo();
		
		System.out.print("Senha: ");
		
		SenhaErrada passwordEntrada = new SenhaErrada();
		
		int senhaPrimeira = passwordEntrada.colocarSenha();
		
		int numeroMaximo = 100000;
		
		//Inicio Senha:

		if (senhaPrimeira < numeroMaximo) {
			
			SenhaErrada senha2 = new SenhaErrada();
			
			senha2.colocarSenha();
			
		} 

		else {
				
			boolean senhaCerta = true;
			System.out.println("");
			System.out.println(" (Carregando...)");
			System.out.println("");
			
			//Sistema de Login
		
			if (senhaCerta = true) {
				
				System.out.println("-------------");
				System.out.println(" Login ");
				System.out.println("-------------");
				System.out.println("");
				System.out.print("Username do Usuario: ");
				Scanner user = new Scanner(System.in);
				String usuarioEntrada = user.nextLine();
				System.out.print("Digite a Senha: ");
				Scanner passentrada = new Scanner(System.in);
				int senhaEntrada = passentrada.nextInt();
				
	            //Igualdade de Senha
				
				if (usuarioEntrada.equals(nomeDeUsuario) && senhaEntrada == senhaPrimeira) {
					
					System.out.println("");
					System.out.println(" (Carregando...) ");
					System.out.println("");
					
					
					 }
					
				else {
					
					System.out.println("");
					System.out.println("-----------------------------");
					System.out.println("");
					System.out.println(" Usuário ou Senha incorretos! ");
					System.out.println("");
					System.out.println("-----------------------------");
					System.out.println("");
					
					System.exit(senhaEntrada);
					
				}
				
			}		
				
		}
		
		return null;
		
	}

}


package fiapmatheus;

import java.util.Scanner;

public class SenhaErrada {
	
	public int colocarSenha() {
		
		Scanner password = new Scanner(System.in);
		int Senha = password.nextInt();
		
		int numeroMinimo = 100000;
		
		if (Senha < numeroMinimo) {
			
		System.out.println("-------------");
		System.out.println("");
		System.out.println(" A senha deve conter pelo menos 6 digitos. ");
		System.out.println("");
		
			SenhaCorreta senha2 = new SenhaCorreta();
			
			senha2.SistemaLogin();
			
			System.exit(Senha);
			
		}
		
		return Senha;
			
		//else  {
			
		//	SenhaCorreta senhaCorreta = new SenhaCorreta();
			
		//	String senhaPrimeira = senhaCorreta.SistemaLogin();
		
	}
	
}

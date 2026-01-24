package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}

	private static void logar() throws LoginInvalidoException{
		Scanner tc = new Scanner(System.in);
		String usernameDB = "Goku";
		String senhaDB = "ssj";
		System.out.println("Usuário");
		String usernameDigitado = tc.nextLine();
		System.out.println("Senha");
		String senhaDigitada = tc.nextLine();
		if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
			throw new LoginInvalidoException("Usuário ou senha inválido");
		}
		System.out.println("Usuário logado com sucesso");
	}
}

package dev.rafael.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
	/*
	 * * Regras para tratamento de exceções ao sobrescrever métodos:
	 * * 1. EXCEÇÕES VERIFICADAS (Checked):
	 * - O método filho PODE lançar a mesma exceção ou subclasses dela (especialização).
	 * - O método filho PODE NÃO lançar nenhuma exceção (mesmo que o pai lance).
	 * - O método filho NÃO PODE lançar exceções mais genéricas (superclasses).
	 * - O método filho NÃO PODE lançar novas exceções verificadas.
	 * * 2. EXCEÇÕES NÃO VERIFICADAS (Unchecked/Runtime):
	 * - Liberdade total. Podem ser adicionadas, removidas ou alteradas sem restrições.
	 */
	@Override
	public void salvar() throws LoginInvalidoException, FileNotFoundException {
		System.out.println("Salvando funcionário");
	}
}

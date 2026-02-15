package dev.rafael.maratonajava.javacore.Hheranca.test;

import dev.rafael.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
	// 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar a classe pai
	// 1 - Bloco de inicialização estatico da sub classe é executado quando a JVM carregar a classe filha
	// 2 - Alocado espaço em memória pro objeto da super classe
	// 3 - Cada atributo de super classe é criado e inicializado com valores default ou o que for passado
	// 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
	// 5 - Construtor da super classe é executado
	// 6 - Alocado espaço em memória pro objeto da sub classe
	// 7 - Cada atributo de sub classe é criado e inicializado com valores default ou o que for passado
	// 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece
	// 9 - Construtor é sub classe é executado
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Jotun");
	}
}

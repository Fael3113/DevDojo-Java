package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario();
		funcionario01.nome = "Sanji";
		funcionario01.idade = 34;
		funcionario01.salario = new double[]{1245, 3876, 4245};
		//funcionario01.salario[0] = 1245;
		//funcionario01.salario[1] = 3876;
		//funcionario01.salario[2] = 4245;

		funcionario01.imprime();
	}
}

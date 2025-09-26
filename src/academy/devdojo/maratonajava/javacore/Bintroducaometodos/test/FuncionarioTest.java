package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario();
		funcionario01.setNome("Sanji");
		funcionario01.setIdade(34);
		funcionario01.setSalario(new double[]{1245, 3876, 4245});
		funcionario01.imprime();
		System.out.println("Media " + funcionario01.getMedia());
	}
}

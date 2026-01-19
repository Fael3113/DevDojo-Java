package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 3");
		endereco.setCep("012354-209");
		Pessoa pessoa = new Pessoa("Toyohusa Shimazu");
		pessoa.setCin("1234234");
		pessoa.setEndereco(endereco);
		pessoa.imprime();
		System.out.println("---------");

		Funcionario funcionario = new Funcionario("Oda Gênio");
		funcionario.setCin("34134");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(1000000);
		funcionario.imprime();
		funcionario.relatorioPagamento();
	}
}

package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
	public static void main(String[] args) {
		Produto produto = new Computador("ESP8266", 30);
		Tomate tomate = new Tomate("Tomatinho", 6);
		tomate.setDataValidade("11/12/2021");

		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("--------");
		CalculadoraImposto.calcularImposto(produto);
	}
}

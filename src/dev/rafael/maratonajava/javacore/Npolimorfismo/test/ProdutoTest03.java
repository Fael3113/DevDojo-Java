package dev.rafael.maratonajava.javacore.Npolimorfismo.test;

import dev.rafael.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import dev.rafael.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import dev.rafael.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import dev.rafael.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

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

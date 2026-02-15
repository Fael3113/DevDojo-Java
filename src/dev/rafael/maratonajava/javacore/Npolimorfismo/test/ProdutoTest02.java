package dev.rafael.maratonajava.javacore.Npolimorfismo.test;

import dev.rafael.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import dev.rafael.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import dev.rafael.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
	public static void main(String[] args) {
		Produto produto = new Computador("ESP8266", 30);
		Produto produto2 = new Tomate("Tomatinho", 6);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println(produto.calcularImposto());
		System.out.println("---------");
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
		System.out.println(produto2.calcularImposto());
	}
}

package dev.rafael.maratonajava.javacore.Npolimorfismo.servico;

import dev.rafael.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import dev.rafael.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
	public static void calcularImposto(Produto produto){
		System.out.println("Relatório de imposto do produto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto "+produto.getNome());
		System.out.println("Valor "+produto.getValor());
		System.out.println("Imposto a ser pago "+imposto);
		if (produto instanceof Tomate){
			Tomate tomate = (Tomate) produto;
			System.out.println("Validade  "+tomate.getDataValidade());
			//System.out.println(((Tomate) produto).getDataValidade());
		}
	}
}

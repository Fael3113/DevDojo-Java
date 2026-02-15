package dev.rafael.maratonajava.javacore.Bintroducaometodos.test;

import dev.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros();
		System.out.println("Finalizando Soma");
		calculadora.subtraiDoisNumeros();
	}
}

package dev.rafael.maratonajava.javacore.Bintroducaometodos.test;

import dev.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		double result = calculadora.divideDoisNumeros(10,2);
		System.out.println(result);
		System.out.println(calculadora.divideDoisNumeros02(4,5));
		System.out.println("------------");
		calculadora.imprimeDivisaoDeDoisNumeros(67,3);
	}
}

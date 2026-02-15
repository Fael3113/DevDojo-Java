package dev.rafael.maratonajava.javacore.Jmodificadorfinal.test;

import dev.rafael.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import dev.rafael.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
	public static void main(String[] args) {
		Carro carro = new Carro();

		System.out.println(Carro.VELOCIDADE_LIMITE);
		System.out.println(carro.COMPRADOR);
		carro.COMPRADOR.setNome("Kuririn");
		System.out.println(carro.COMPRADOR);

		Ferrari ferrari = new Ferrari();
		ferrari.setNome("Vermelha");
		carro.COMPRADOR.setNome("Goku");
		ferrari.imprime();
		System.out.println(carro.COMPRADOR);
	}
}

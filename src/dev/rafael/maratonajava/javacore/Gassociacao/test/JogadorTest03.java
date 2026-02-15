package dev.rafael.maratonajava.javacore.Gassociacao.test;

import dev.rafael.maratonajava.javacore.Gassociacao.dominio.Jogador;
import dev.rafael.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
	public static void main(String[] args) {
		Jogador jogador = new Jogador("Cafu");
		Jogador jogador2 = new Jogador("Pelé");

		Time time = new Time("Brasil");
		Jogador[] jogadores = {jogador, jogador2};

		jogador.setTime(time);
		jogador2.setTime(time);

		time.setJogadores(jogadores);

		System.out.println("--- Jogador ---");
		jogador.imprime();
		jogador2.imprime();

		System.out.println("--- Time ---");
		time.imprime();
	}
}

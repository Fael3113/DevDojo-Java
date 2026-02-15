package dev.rafael.maratonajava.javacore.Csobrecargametodos.test;

import dev.rafael.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime();
		anime.init("One Punch Man", "TV", 12, "Ação");
		anime.imprime();
	}
}

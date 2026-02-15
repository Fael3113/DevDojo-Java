package dev.rafael.maratonajava.javacore.Dconstrutores.test;

import dev.rafael.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime("One Punch Man", "TV", 12, "Ação","Madhouse");
		anime.imprime();
	}
}

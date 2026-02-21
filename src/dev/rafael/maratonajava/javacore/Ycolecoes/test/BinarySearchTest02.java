package dev.rafael.maratonajava.javacore.Ycolecoes.test;

import dev.rafael.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		mangas.add(new Manga(4L,"Kingdom", 19.9));
		mangas.add(new Manga(1L,"Vagabond",22.99));
		mangas.add(new Manga(3L,"Vinland Saga",23.4));
		mangas.add(new Manga(2L,"Berserk",10.10));

		mangas.sort(new MangaByIdComparator());

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		Manga mangaToSearch = new Manga(4L, "Kingdom", 19.9);

		System.out.println(Collections.binarySearch(mangas, mangaToSearch));
		//O Comparable da classe Manga, foi feito para retorna a ordem via nome
	    //Enquanto no segundo caso é por Id, caso devolvam o mesmo resultado, é mera coincidência
		System.out.println(Collections.binarySearch(mangas, mangaToSearch, new MangaByIdComparator())); //Forma correta
	}
}

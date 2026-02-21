package dev.rafael.maratonajava.javacore.Ycolecoes.test;

import dev.rafael.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
	@Override
	public int compare(Manga manga1, Manga manga2) {
		return manga1.getId().compareTo(manga2.getId());
	}
}

public class MangaSortTest01 {
	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		mangas.add(new Manga(4L,"Kingdom", 19.9));
		mangas.add(new Manga(2L,"Berserk",10.10));
		mangas.add(new Manga(1L,"Vagabond",22.99));
		mangas.add(new Manga(3L,"Vinland Saga",23.4));
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
//		Collections.sort(mangas, new MangaByIdComparator());
		mangas.sort(new MangaByIdComparator()); //Comparator tem prioridade sobre o Comparable
		System.out.println("-----");
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}
}

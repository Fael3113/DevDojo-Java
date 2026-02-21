package dev.rafael.maratonajava.javacore.Ycolecoes.test;

import dev.rafael.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		mangas.add(new Manga(4L,"Kingdom", 19.9, 0));
		mangas.add(new Manga(2L,"Berserk",10.10, 5));
		mangas.add(new Manga(1L,"Vagabond",22.99, 0));
		mangas.add(new Manga(3L,"Vinland Saga",23.4, 2));

//		Iterator<Manga> mangaIterator = mangas.iterator();
//		while (mangaIterator.hasNext()){
//			Manga manga = mangaIterator.next();
//			if (manga.getQuantidade() == 0){
//				mangaIterator.remove();
//			}
//		}
//		System.out.println(mangas);

		mangas.removeIf(manga -> manga.getQuantidade() == 0);
		System.out.println(mangas);
	}
}

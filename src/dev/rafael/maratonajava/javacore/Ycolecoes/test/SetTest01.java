package dev.rafael.maratonajava.javacore.Ycolecoes.test;

import dev.rafael.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
	public static void main(String[] args) {
		Set<Manga> mangas = new LinkedHashSet<>(); //Mantém a ordem de inserção. Mais lento
//		Set<Manga> mangas = new HashSet<>(); Ordem "imprevisível".
		mangas.add(new Manga(4L,"Kingdom", 19.9));
		mangas.add(new Manga(1L,"Vagabond",22.99));
		mangas.add(new Manga(3L,"Vinland Saga",20.4));
		mangas.add(new Manga(2L,"Berserk",10.10));
		mangas.add(new Manga(2L,"Berserk",10.10)); //Não permitem duplicata pelo critério do hashCode() e equals()

		for(Manga manga: mangas){
			System.out.println(manga);
		}
	}
}

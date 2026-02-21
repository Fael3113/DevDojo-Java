package dev.rafael.maratonajava.javacore.Ycolecoes.test;

import dev.rafael.maratonajava.javacore.Ycolecoes.dominio.Manga;
import dev.rafael.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
	@Override
	public int compare(Smartphone o1, Smartphone o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}
}

class MangaPrecoComparator implements Comparator<Manga>{
	@Override
	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
}

public class NevigableSetTest01 {
	public static void main(String[] args) {
		NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
		Smartphone smartphone = new Smartphone("123", "Poco");
		set.add(smartphone);
		System.out.println(set);
		System.out.println("--------");

		NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
		mangas.add(new Manga(4L,"Kingdom", 19.9));
		mangas.add(new Manga(1L,"Vagabond",22.99));
		mangas.add(new Manga(3L,"Vinland Saga",20.4));
		mangas.add(new Manga(2L,"Berserk",30.10));
		mangas.add(new Manga(10L,"Aragon",2.10));
		//Não aceita duplicata de acordo com o Comparable/Comparator configurado, independemente do equals() ou hashCode()
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
		Manga yuyu = new Manga(21L, "Yuyu Hakusho", 19.9, 5);
		System.out.println("------");
		System.out.println(mangas.lower(yuyu));
		System.out.println(mangas.floor(yuyu));
		System.out.println(mangas.higher(yuyu));
		System.out.println(mangas.ceiling(yuyu));

		System.out.println(mangas.size());
		System.out.println(mangas.pollLast());
		System.out.println(mangas.size());

	}
}

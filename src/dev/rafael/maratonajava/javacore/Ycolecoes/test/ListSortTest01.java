package dev.rafael.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
	public static void main(String[] args) {
		List<String> mangas = new ArrayList<>(6);
		mangas.add("Kingdom");
		mangas.add("Berserk");
		mangas.add("Vagabond");
		mangas.add("Vinland Saga");

		Collections.sort(mangas);

		List<Double> dinheiros = new ArrayList<>();
		dinheiros.add(1000.31);
		dinheiros.add(5400.31);
		dinheiros.add(4300.31);
		dinheiros.add(10D);

		Collections.sort(dinheiros);

		for(String manga : mangas){
			System.out.println(manga);
		}

		for (Double dinheiro : dinheiros){
			System.out.println(dinheiro);
		}
	}
}

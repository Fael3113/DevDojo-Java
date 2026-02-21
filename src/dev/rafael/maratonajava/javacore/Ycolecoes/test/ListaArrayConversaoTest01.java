package dev.rafael.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		Integer[] listToArray = numeros.toArray(new Integer[0]);
		System.out.println(Arrays.toString(listToArray));

		Integer[] numerosArray = new Integer[4];
		numerosArray[0] = 1;
		numerosArray[1] = 2;
		numerosArray[2] = 3;
		numerosArray[3] = 4;

		List<Integer> arrayToList = Arrays.asList(numerosArray); //asLsit é imutável
		arrayToList.set(0, 12); //Modificar é possível, mas adicionar não
		System.out.println("------");
		System.out.println(Arrays.toString(numerosArray));
		System.out.println(arrayToList);

		System.out.println("--------");
		List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
		numerosList.add(14);
		System.out.println(numerosList);

		List<String> strings = Arrays.asList("1", "2", "3");

	}
}

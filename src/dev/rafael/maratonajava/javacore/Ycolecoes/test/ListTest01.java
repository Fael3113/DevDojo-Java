package dev.rafael.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		//List nomes = new ArrayList(); // 1.4
		//<> define o tipo de Objeto
		List<String> nomes = new ArrayList<>(16); // 1.5
		List<String> nomes2 = new ArrayList<>(16);

		nomes.add("William");
		nomes.add("William");
		nomes2.add("DevDojo Academy");
		nomes2.add("125");
		nomes.addAll(nomes2);
		nomes.remove("William");
		//nomes.remove(); remove tanto via indice como por objeto, mas o objeto deve ser exatamente igual e apenas 1 por vez

		for (String nome: nomes){
			System.out.println(nome);
			//Não fazer nomes.add() aqui, se não gerá exceção
		}
		nomes.add("Suane");
		System.out.println("---");
		int size = nomes.size(); //evite que o for vire um loop infinito se fizer um add dentro do for
		for (int i = 0; i < size; i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println("---");
		System.out.println(nomes);

		//Não gerar listas com tipos primitivos, utilize os Wrappers
		List<Integer> numeros = new ArrayList<>();
		numeros.add(123);
		numeros.add(12);
	}
}

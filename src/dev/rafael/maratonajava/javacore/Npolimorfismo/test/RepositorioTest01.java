package dev.rafael.maratonajava.javacore.Npolimorfismo.test;

import dev.rafael.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import dev.rafael.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
	public static void main(String[] args) {
		Repositorio repositorioBancoDeDados = new RepositorioMemoria();
		repositorioBancoDeDados.salvar();
		List<String> list = new ArrayList<>();
		list.add("Goku");
		list.add("Vegeta");
		list.add("Kuririn");
		System.out.println(list);
	}
}

package dev.rafael.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
	public static void main(String[] args) {
		int age = 13;
		String category;
//		if (age < 15) {
//			category = "Categoria infantil";
//		} else if (age >= 15 && age < 18) {
//			category = "Categoria juvenil";
//		} else {
//			category = "Categoria adulta";
//		}
		category = age < 15 ? "Categoria infantil" : age >= 15 && age < 18 ? "Categoria juvenil" : "Categoria adulta";
		System.out.println(category); //variaveis locais precisam ser inicializadas
	}
}

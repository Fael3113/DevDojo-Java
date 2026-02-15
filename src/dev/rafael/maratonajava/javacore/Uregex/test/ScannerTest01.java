package dev.rafael.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
	public static void main(String[] args) {
		String texto = "Levi, Eren, Mikasa, true, 200";
		String[] nomes = texto.split(",");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i].trim());
		}

	}
}

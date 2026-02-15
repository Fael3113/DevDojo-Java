package dev.rafael.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
	public static void main(String[] args) {
		//while, do-while, for
		int count = 0;

		while (count < 10){
			//Apenas executa se a condição for verdadeira
			System.out.println(count);
			count++;
		}

		count = 0;
		do {
			System.out.println("Dentro do do-while "+count);
			count++;
		} while (count < 10);

		for (count = 0; count < 10; count++){
			System.out.println("Dentro do for "+count);
		}
	}
}

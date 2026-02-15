package dev.rafael.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		//int, double, float, char, byte, short, long, boolean
		int age = 10;
		long numberBig = 1000000L;
		double salaryDouble = 2000.0D;
		float salaryFloat = 2500.0F;
		byte ageByte = 127;
		short ageShort = 32000;
		boolean verdadeiro = true;
		boolean falso = false;
		char character = 65; //Tabela ASCII
		char character1 = '\u0041'; //Tabela Unicode

		int casting = (int) 10000000000L;
		/*Forçar valor, pode ocasionar em problema na capacidade binaria da variável
		Recomenda-se trocar a variável na maioria dos casos*/

		String nome = "Goku";

		System.out.println("A idade é: "+age+" anos");
		System.out.println(falso);
		System.out.println(character);
		System.out.println(character1);

		System.out.println(casting);
		System.out.println("Oi, eu sou o "+nome);
	}
}

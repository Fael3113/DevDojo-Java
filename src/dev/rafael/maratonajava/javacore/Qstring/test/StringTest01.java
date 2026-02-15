package dev.rafael.maratonajava.javacore.Qstring.test;

public class StringTest01 {
	public static void main(String[] args) {
		String nome = "William"; //String constant pool
		String nome2 = "William";

		//Strings são imutáveis até o momento de atribuir um novo valor
		nome = nome.concat(" Suane"); // nome += " Suane"
		System.out.println(nome.equals(nome2));

		String nome3 = new String("William"); //1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string
		System.out.println(nome2 == nome3);
		System.out.println(nome2 == nome3.intern());
	}
}

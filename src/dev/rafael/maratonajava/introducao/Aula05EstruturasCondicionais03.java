package dev.rafael.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
	public static void main(String[] args) {
		double salary = 3000;
		String messageDonate = "Eu vou doar 500 pro DevDojo.";
		String messageNotDonate = "Ainda não tenho condições, mas vou ter!";
		//(condicao) ? verdadeiro : falso
		//System.out.println(salary > 5000 ? messageDonate : messageNotDonate);
		String result = salary > 5000 ? messageDonate : messageNotDonate;
		System.out.println(result);
	}
}

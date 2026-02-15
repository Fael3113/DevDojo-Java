package dev.rafael.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
	public static void main(String[] args) {
		int age = 15;
		boolean isAuthorizedPurchaseDrink = age >= 18;
		// !
		if (isAuthorizedPurchaseDrink) {
			System.out.println("Autorizado a comprar bebida alcólica");
		} else {
			System.out.println("Não autorizado a comprar bebida alcólica");
		}

		if (!isAuthorizedPurchaseDrink) { //isAuthorizedPurchaseDrink == false
			System.out.println("Não autorizado a comprar bebida alcólica");
		}

		//Caso de prova usando boolean com atribuição, tomar cuidado:
		boolean c = false;
		if (c = true) {
			System.out.println("Dentro de algo que nunca deve ser feito");
		}
		System.out.println("Fora do if");
	}
}

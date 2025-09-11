package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
	public static void main(String[] args) {
		Carro carro01 = new Carro();
		Carro carro02 = new Carro();

		carro01.name = "Fusca Bala";
		carro01.age = 1969;
		carro01.model = "Sport";

		carro02.name = "Corolla";
		carro02.age = 2012;
		carro02.model = "Hybrid";

		//Referência de objetos (apenas para objetos do mesmo tipo de herança):
		//carro01 = carro02; / carro02 = carro01;

		System.out.println("Carro 1");
		System.out.println(carro01.name);
		System.out.println(carro01.age);
		System.out.println(carro01.model);

		System.out.println("\nCarro 2");
		System.out.println(carro02.name);
		System.out.println(carro02.age);
		System.out.println(carro02.model);

	}
}


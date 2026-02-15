package dev.rafael.maratonajava.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		//+ - * /
		int number01 = 10;
		int number02 = 20;
		double result01 = number01 / number02;
		double result02 = number01 / (double) number02;
		/*Para se fazer uma conta com resultado em número racional
		Deve-se usar váriaveis de números racionais, e não inteiros*/
		System.out.println(result01);
		System.out.println(result02);

		//%
		int remainder = 21 % 2;
		System.out.println(remainder);

		//< > <= >= == !=
		boolean isTenBiggerThanTwenty = 10 > 20;
		boolean isTenLessThanTwenty = 10 < 20;
		boolean isTenEqualTwenty = 10 == 20;
		boolean isTenEqualTen = 10 == 10;
		boolean isTenDifferentTwenty = 10 != 20;
		boolean isTenDifferentTen = 10 != 10;
		//Não comparar valores incomparáveis

		System.out.println("isTenBiggerThan " + isTenBiggerThanTwenty);
		System.out.println("isTenLessThan " + isTenLessThanTwenty);
		System.out.println("isTenEqualTwenty " + isTenEqualTwenty);
		System.out.println("isTenEqualTen " + isTenEqualTen);
		System.out.println("isTenDifferentTwenty " + isTenDifferentTwenty);
		System.out.println("isTenDifferentTen " + isTenDifferentTen);

		//AND (&&) OR (||)
		int age = 29;
		float salary = 3500F;
		boolean isWithinLawBiggerThirty = age >= 30 && salary >= 4612;
		boolean isWithinLawLowerThirty = age < 30 && salary >= 3381;
		System.out.println("isWithinLawBiggerThirty " + isWithinLawBiggerThirty);
		System.out.println("isWithinLawLowerThirty " + isWithinLawLowerThirty);

		double valueTotalCheckingAccount = 200;
		double valueTotalCDBAccount = 10000;
		float valuePlaystation = 5000F;
		boolean isPlaystation5Purchasable = valueTotalCheckingAccount > valuePlaystation || valueTotalCDBAccount > valuePlaystation;
		System.out.println("isPlaystation5Purchasable " + isPlaystation5Purchasable);

		// = += -= *= /= %=
		double bonus = 1800;
		//bonus = bonus + 1000;
		bonus += 1000; //2800
		bonus -= 1000; //1800
		bonus *= 2; //3600
		bonus /= 3; //1200
		bonus %= 2; //0
		System.out.println(bonus);

		//++ --
		int counter = 0;
		counter += 1;
		counter++;
		counter--;
		++counter;
		--counter;
		int counter2 = 0;
		System.out.println(++counter2); //Posição do incremento interfere na ordem de execução
	}
}

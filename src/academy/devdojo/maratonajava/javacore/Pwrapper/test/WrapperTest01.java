package academy.devdojo.maratonajava.javacore.Pwrapper.test;

import java.util.List;

public class WrapperTest01 {
	public static void main(String[] args) {
		//Usar primitivos sempre que possível, pois entrega uma performance melhor e uma economia no uso de memória
		byte byteP = 1;
		short shortP = 1;
		int intP = 1;
		long longP = 10L;
		float floatP = 10F;
		double doubleP = 10D;
		char charP = 'W';
		boolean booleanP = false;

		//Usar Wrapper apenas quando necessário (como uso em Collections)
		Byte byteW = 127;
		Short shortW = 1;
		Integer intW = 1; //autoboxing
		Long longW = 10L;
		Float floatW = 10F;
		Double doubleW = 10D;
		Character charW = 'W';
		Boolean booleanW = false;

		int i = intW; //unboxing
		int intP2 = Integer.parseInt("1");
		boolean verdadeiro = Boolean.parseBoolean(null);
		System.out.println(verdadeiro);

		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isLetter('6'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
	}
}

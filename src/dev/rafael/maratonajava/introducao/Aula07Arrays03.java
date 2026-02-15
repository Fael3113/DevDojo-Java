package dev.rafael.maratonajava.introducao;

public class Aula07Arrays03 {
	public static void main(String[] args) {
		//int[] numbers = new int[3];
		//int[] numbers = new int[]{1,2,3,4,5};
		int[] numbers = {1, 2, 3, 4, 5};

//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

		for (int num : numbers) {
			System.out.println(num);
		}
	}
}

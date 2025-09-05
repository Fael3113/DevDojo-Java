package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
	public static void main(String[] args) {
		double salary = 25000;
		double tax = 0;
		double incomeTax = 0;
		if (salary <= 34712){
			tax = 0.097;
			incomeTax = salary * tax;
		} else if (salary >= 34713 && salary <= 68507) {
			tax = 0.3735;
			incomeTax = salary * tax;
		} else {
			tax = 0.4950;
			incomeTax = salary * tax;
		}
		System.out.println("Seu imposto de renda é: "+incomeTax);
	}
}

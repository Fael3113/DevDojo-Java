package dev.rafael.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
	public static void main(String[] args) {
		double valueCar = 30000;
		for (int installment = 1; installment <= valueCar; installment++) {
			double valueInstallment = valueCar / installment;
			if (valueInstallment < 1000) {
				break;
			}
			System.out.println("Parcela " + installment + " R$ " + valueInstallment);
		}
	}
}

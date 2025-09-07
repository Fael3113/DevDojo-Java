package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
	public static void main(String[] args) {
		double valueMax = 30000;
		for (int installment = (int) valueMax; installment >= 1; installment--) {
			double valueInstallment = valueMax / installment;
			if (valueInstallment < 1000) {
				continue;
			}
			System.out.println("Parcela " + installment + " R$ " + valueInstallment);
		}
	}
}

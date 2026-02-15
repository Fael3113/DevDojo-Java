package dev.rafael.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
	public static void main(String[] args) {
		Locale localeUS = Locale.US;
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance(); //pt-BR
		nfa[1] = NumberFormat.getInstance(localeIT);
		nfa[2] = NumberFormat.getInstance(localeUS);
		nfa[3] = NumberFormat.getInstance(localeJP);
		double valor = 1_000.2130;
		for (NumberFormat numberFormat : nfa) {
			numberFormat.setMaximumFractionDigits(2);
			System.out.println(numberFormat.format(valor));
		}
		String valorString = "1000,2130"; //Dependendo da lingua do sistema, a ',' deverá ser trocada por '.' e vice-versa
		                                  //Do contrário, o parse dará um resultado inesperado
		try {
			System.out.println(nfa[0].parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

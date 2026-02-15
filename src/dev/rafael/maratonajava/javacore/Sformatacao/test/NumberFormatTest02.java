package dev.rafael.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
	public static void main(String[] args) {
		Locale localeUS = Locale.US;
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getCurrencyInstance(); //pt-BR
		nfa[1] = NumberFormat.getCurrencyInstance(localeIT);
		nfa[2] = NumberFormat.getCurrencyInstance(localeUS);
		nfa[3] = NumberFormat.getCurrencyInstance(localeJP);
		double valor = 1_000.2130;
		for (NumberFormat numberFormat : nfa) {
			System.out.println("Casa decimal "+numberFormat.getMaximumFractionDigits());
			System.out.println(numberFormat.format(valor));
		}
		//Para o BR e IT (e provavelmente outras), foi necessário usar o   no espaço onde teoricamente está em branco no output
		//Dificil descobrir um problema "invisível"
		String valorString = "1.000,21 €";
		try {
			System.out.println(nfa[1].parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

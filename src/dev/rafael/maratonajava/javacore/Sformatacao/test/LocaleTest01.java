package dev.rafael.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
	public static void main(String[] args) {
		//ISO 639 alpha-2/3 ISO 3166 alpha-2
		Locale localeItaly = new Locale("it","IT");
		Locale localeCH = new Locale("it","CH");
		Locale localeIndia = new Locale("hi","IN");
		Locale localeJapao = new Locale("ja","JP");
		Locale localeHolando = new Locale("nl","NL");

		Calendar calendar = Calendar.getInstance();

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,  localeItaly);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,  localeCH);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,  localeIndia);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,  localeJapao);
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,  localeHolando);

		System.out.println("Italia "+df1.format(calendar.getTime()));
		System.out.println("Suiça "+df2.format(calendar.getTime()));
		System.out.println("India "+df3.format(calendar.getTime()));
		System.out.println("Japão "+df4.format(calendar.getTime()));
		System.out.println("Holanda "+df5.format(calendar.getTime()));

		//Exibe o pais por padrão na lingua do sistema (Windows)
		System.out.println(localeItaly.getDisplayCountry(localeJapao));
		System.out.println(localeCH.getDisplayCountry());
	}
}

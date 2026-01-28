package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println(Calendar.getInstance());
		LocalDate date = LocalDate.now(); //É imutável, então qualquer mudança deve ser atribuida
		LocalDate date2 = LocalDate.of(2024,1,22);
		System.out.println(date);
		System.out.println(date2);
		System.out.println(date2.getMonth());
		System.out.println(date2.getDayOfWeek());
		System.out.println(date2.getMonthValue());
		System.out.println(date2.getYear());
		System.out.println(date2.lengthOfMonth());
		System.out.println(date2.isLeapYear()); //Devolve True se o ano for bissexto
	}
}

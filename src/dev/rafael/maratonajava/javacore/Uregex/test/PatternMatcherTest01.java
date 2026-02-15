package dev.rafael.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
	public static void main(String[] args) {
		String regex = "aba";
		String texto = "abaaba";
		String texto2 = "abababa";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto2);
		//matcher, por padrão, ignora posições já vistas, mesmo que pudessem se enquadrar no pattern em uma visão macro
		System.out.println("texto:  "+texto2);
		System.out.println("indice: 0123456789");
		System.out.println("regex "+regex);
		System.out.println("Posições encontradas");
		while (matcher.find()){
			System.out.print(matcher.start()+ " ");
		}
	}
}

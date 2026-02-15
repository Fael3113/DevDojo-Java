package dev.rafael.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
	public static void main(String[] args) {
		//Meta caracteres mais "usuais"
		// \d = Retorna todos os digitos
		// \D = Retorna tudo o que não for digito
		// \s = Retorna "espaços" em branco: \t \n \f \r
		// \S = Retorna todos os caracteres, excluindo os "espaços"
		// \w = Retorna a-ZA-A, digitos, _
		// \W = Retorna tudo que não for incluso no \w
		String regex = "\\w";
		//String texto = "cafeBABE";
		String texto2 = "@#4h_h1823 h4u";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto2);
		//matcher, por padrão, ignora posições já vistas, mesmo que pudessem se enquadrar no pattern em uma visão macro
		System.out.println("texto:  "+texto2);
		System.out.println("indice: 0123456789");
		System.out.println("regex "+regex);
		System.out.println("Posições encontradas");
		while (matcher.find()){
			System.out.print(matcher.start()+ " "+matcher.group()+"\n");
		}
	}
}

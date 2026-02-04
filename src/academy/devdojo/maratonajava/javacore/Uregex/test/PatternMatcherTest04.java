package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
	public static void main(String[] args) {
		//Meta caracteres mais "usuais"
		// \d = Retorna todos os digitos
		// \D = Retorna tudo o que não for digito
		// \s = Retorna "espaços" em branco: \t \n \f \r
		// \S = Retorna todos os caracteres, excluindo os "espaços"
		// \w = Retorna a-ZA-A, digitos, _
		// \W = Retorna tudo que não for incluso no \w
		// [] = Retorna o conteúdo especificado
		// ? Zero ou uma
		// * Zero ou mais
		// + Uma ou mais
		// {n,m} de n até m
		// ()
		// |
		// $
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		//matcher, por padrão, ignora posições já vistas, mesmo que pudessem se enquadrar no pattern em uma visão macro
		System.out.println("texto:  "+texto);
		System.out.println("indice: 0123456789");
		System.out.println("regex "+regex);
		System.out.println("Posições encontradas");
		while (matcher.find()){
			System.out.print(matcher.start()+ " "+matcher.group()+"\n");
		}
	}
}

package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
	public static void main(String[] args) {
		//Meta caracteres mais "usuais"
		// \d = Retorna todos os digitos
		// \D = Retorna tudo o que não for digito
		// \s = Retorna "espaços" em branco: \t \n \f \r
		// \S = Retorna todos os caracteres, excluindo os "espaços"
		// \w = Retorna a-ZA-A, digitos, _
		// \W = Retorna tudo que não for incluso no \w
		// [] = Retorna o conteúdo especificado
		//String regex = "[a-zA-Z]";
		String regex = "0[xX][0-9a-fA-F]";
		String texto = "cafeBABE";
		String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
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
		int numeroHex = 0x59F86A;
		System.out.println(numeroHex);
	}
}

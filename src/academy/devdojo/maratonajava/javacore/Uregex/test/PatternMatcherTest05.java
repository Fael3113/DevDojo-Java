package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
		// . 1.3 = 123, 133, 1@3, 1A3
		String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+"; //depende do padrão/rigorosidade do provedor
		String texto = "luffy@hotmail.com, 123deoliveira4@gmail.com, #!@zoro@mail.br, teste@gmail.com.br, sakura@mail";
		System.out.println("#!@zoro@mail.br é email válido (de acordo com as regras)?");
		System.out.println(texto.split(",")[1].trim());
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

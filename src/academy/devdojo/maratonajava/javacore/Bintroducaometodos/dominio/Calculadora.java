package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
	//Metodo com saída, mas sem retorno
	public void somaDoisNumeros(){
		System.out.println(10+10);
	}
	//Metodo \|/
	public void subtraiDoisNumeros(){
		System.out.println(21-2);
	}
	                             //Parametros \|/
	public void multiplicaDoisNumeros(int n1, int n2){
		System.out.println(n1*n2);
	}
	//Metodo com retorno, mas sem saída
	public double divideDoisNumeros(double n1, double n2){
		if (n2 == 0){
			return 0;
		}
		return n1/n2;
	}

	public double divideDoisNumeros02(double n1, double n2){
		if (n2 != 0){
			return n1/n2;
		}
		return 0;
	}

	public void imprimeDivisaoDeDoisNumeros(double n1, double n2){
		if (n2 == 0){
			System.out.println("Não existe divisão por zero");
		}
		System.out.println(n1/n2);
	}

	public void alteraDoisNumeros(int n1, int n2){
		n1 = 99;
		n2 = 33;
		System.out.println("Dentro do alteraDoisNumeros");
		System.out.println("N1 "+n1);
		System.out.println("N2 "+n2);
	}

	public void  somaArray(int [] numeros){
		int soma = 0;
		for (int num: numeros){
			soma+= num;
		}
		System.out.println(soma);
	}

	public void somaVarArgs(int... numeros){
		int soma = 0;
		for (int num: numeros){
			soma+= num;
		}
		System.out.println(soma);
	}
}

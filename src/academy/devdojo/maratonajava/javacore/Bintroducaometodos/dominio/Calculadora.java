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
}

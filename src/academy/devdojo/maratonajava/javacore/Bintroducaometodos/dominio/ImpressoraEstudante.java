package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
	public void imprime(Estudante estudante){
		System.out.println("----------------");

		System.out.println(estudante.name);
		System.out.println(estudante.age);
		System.out.println(estudante.sex);

		estudante.name = "Gohan"; //Quando se altera algo dentro do objeto, essa alteração ficará salva em referencias futuras
	}
}

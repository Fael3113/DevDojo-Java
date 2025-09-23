package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
	public String nome = null;
	public int idade = 0;
	public double [] salario = null;

	public void imprime(){
		System.out.println("---------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		if (salario == null){
			return;
		}
		System.out.println("Salários: "+Arrays.toString(this.salario));
		/*
		for (double salarios : salario){
			System.out.println(salario + " ");
		}
		*/
		media();
	}

	public void media(){
		if (salario == null){
			return;
		}

		double media = 0;
		for (double salarios : salario){
			media+= salarios;
		}
		media /= salario.length;
		System.out.println("Média salarial: "+media);
	}
}

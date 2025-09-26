package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
	private String nome = null;
	private int idade = 0;
	private double [] salario = null;
	private double media;

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
		for (double salarios : salario){
			media+= salarios;
		}
		media /= salario.length;
		System.out.println("Média salarial: "+media);
	}

	public double getMedia() {
		return media;
	}

	public double[] getSalario() {
		return salario;
	}

	public void setSalario(double[] salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

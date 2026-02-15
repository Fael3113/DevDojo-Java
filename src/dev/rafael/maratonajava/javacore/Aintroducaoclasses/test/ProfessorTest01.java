package dev.rafael.maratonajava.javacore.Aintroducaoclasses.test;

import dev.rafael.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.name = "Mestre Kame";
		professor.age = 140;
		professor.sex = 'M';
		System.out.println("Nome: "+professor.name + " Idade: " + professor.age + " Sexo: " + professor.sex);
	}
}
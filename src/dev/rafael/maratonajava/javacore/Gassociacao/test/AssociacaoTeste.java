package dev.rafael.maratonajava.javacore.Gassociacao.test;

import dev.rafael.maratonajava.javacore.Gassociacao.dominio.Aluno;
import dev.rafael.maratonajava.javacore.Gassociacao.dominio.Local;
import dev.rafael.maratonajava.javacore.Gassociacao.dominio.Professor;
import dev.rafael.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
	public static void main(String[] args) {
		Local local = new Local("Grove 13");

		Aluno aluno = new Aluno("Luffy",17);
		Aluno[] alunosParaSeminario = {aluno};

		Professor professor = new Professor("Rayleigh", "Haki");

		Seminario seminario = new Seminario("Rei dos Piratas", local, alunosParaSeminario);
		Seminario seminario2 = new Seminario("Derrotar os Cavaleiros de Deus", local, alunosParaSeminario);

		Seminario[] seminariosDisponiveis = {seminario,seminario2};

		professor.setSeminarios(seminariosDisponiveis);
		professor.imprime();
	}
}

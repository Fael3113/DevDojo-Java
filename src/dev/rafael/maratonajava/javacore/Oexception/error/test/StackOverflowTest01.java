package dev.rafael.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
	public static void main(String[] args) {
		//Error é alguém que acontece na JVM e dificilmente vai ser recuperado em tempo execução
		recursividade();
	}

	public static void recursividade(){
		recursividade();
	}
}

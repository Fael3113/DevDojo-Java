package dev.rafael.maratonajava.javacore.Vio.test;
// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
	public static void main(String[] args) {
		File file = new File("file.txt");
		try (FileWriter fileWriter = new FileWriter(file)){
			fileWriter.write("Esse curso está mostrando diversas ferramentas do JAVA 8 que muitas faculdade nem chega a abordar\n"+
					"Continuando na próxima linha");
			fileWriter.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

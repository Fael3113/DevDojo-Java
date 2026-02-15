package dev.rafael.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
	public static void main(String[] args) {
		File file = new File("file.txt");
		try (FileWriter fileWriter = new FileWriter(file);
		     BufferedWriter bw = new BufferedWriter(fileWriter)){
			bw.write("Esse curso está mostrando diversas ferramentas do JAVA 8 que muitas faculdade nem chega a abordar");
			bw.newLine();
			bw.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

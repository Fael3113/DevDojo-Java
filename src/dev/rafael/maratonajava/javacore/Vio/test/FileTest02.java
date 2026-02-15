package dev.rafael.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) throws IOException {
		File diretorio = new File("pasta");
		boolean isDiretorioCreated = diretorio.mkdir();
		System.out.println(isDiretorioCreated);

		File arquivoDiretorio = new File(diretorio,"arquivo.txt");
		boolean isFileCreated = arquivoDiretorio.createNewFile();
		System.out.println(isFileCreated);

		File fileRenamed = new File(diretorio,"arquivo_renomeado.txt");
		boolean isFileRenamed = arquivoDiretorio.renameTo(fileRenamed);
		System.out.println(isFileRenamed);

		File diretorioRenamed = new File("pasta2");
		boolean isDiretorioRenamed = diretorio.renameTo(diretorioRenamed);
		System.out.println(isDiretorioRenamed);
	}
}

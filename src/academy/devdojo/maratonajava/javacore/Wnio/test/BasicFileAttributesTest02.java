package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
	public static void main(String[] args) throws IOException {
		//BasicFileAttributes: genérico (todos os SOs)
		Path path = Paths.get("pasta2/new.txt");
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		FileTime creationTime = basicFileAttributes.creationTime();
		FileTime lastedModifiedTime = basicFileAttributes.lastModifiedTime();
		FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

		System.out.println("CreationTime "+creationTime);
		System.out.println("ModifiedTime "+lastedModifiedTime);
		System.out.println("AccessTime "+lastAccessTime);

		//BasicFileAttributeView, DosFileAttributeView, PosixFileAttributeView

		BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		FileTime newAcessTime = FileTime.fromMillis(System.currentTimeMillis());
		fileAttributeView.setTimes(lastedModifiedTime, newAcessTime ,creationTime);

		creationTime = fileAttributeView.readAttributes().creationTime();
		lastedModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
		lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

		System.out.println("---------");
		System.out.println("CreationTime "+creationTime);
		System.out.println("ModifiedTime "+lastedModifiedTime);
		System.out.println("AccessTime "+lastAccessTime);
	}
}

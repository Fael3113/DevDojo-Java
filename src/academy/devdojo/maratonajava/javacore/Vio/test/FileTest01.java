package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\User\\Documents\\Liguagem-de-Programacao\\DevDojo-Java\\arquivo\\file.txt");
		try {
			boolean isCreated = file.createNewFile();
			System.out.println("Created "+isCreated);
			System.out.println("Path "+ file.getPath());
			System.out.println("Absolute path "+ file.getAbsolutePath());
			System.out.println("Directory "+ file.isDirectory());
			System.out.println("File "+ file.isFile());
			System.out.println("Hidden "+ file.isHidden());
			System.out.println("Last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
			boolean exists = file.exists();
			if (exists){
				System.out.println("Deleted "+file.delete());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

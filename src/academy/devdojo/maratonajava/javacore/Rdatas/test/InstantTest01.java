package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now + " Instant utiliza Zulu Time");
		System.out.println(LocalDateTime.now() + " LocalDateTime utiliza UTC");
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano());
		System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
		System.out.println(Instant.ofEpochSecond(3,0));

	}
}

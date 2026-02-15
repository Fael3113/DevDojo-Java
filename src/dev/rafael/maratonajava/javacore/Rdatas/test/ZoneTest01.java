package dev.rafael.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
	public static void main(String[] args) {
		Map<String, String> shortsIds = ZoneId.SHORT_IDS;
		System.out.println(shortsIds);
		System.out.println(ZoneId.systemDefault()); //UTC atual
		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); //UTC alvo
		System.out.println(tokyoZone);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDateTime now2 = LocalDateTime.now(tokyoZone); //Ver o UTC aplicado na saida
		System.out.println(now2);
		ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
		System.out.println(zonedDateTime); //Ver do horário no UTC atual + o código do UTC desejado

		System.out.println("---------");
		Instant nowInstant = Instant.now();
		System.out.println(nowInstant);
		ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
		System.out.println(zonedDateTime1); //Instant aplica o UTC alvo e informa qual é

		System.out.println("---------");
		System.out.println(ZoneOffset.MIN);
		System.out.println(ZoneOffset.MAX);

		System.out.println("-------");
		ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
		OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
		System.out.println(offsetDateTime); //Ver do horário no UTC atual + o código do UTC desejado
		System.out.println(LocalDateTime.now(zoneOffsetManaus)); //Ver o UTC aplicado na saida

		System.out.println("------");
		//Como ver o calendário imperial japones
		JapaneseDate japaneseDate = JapaneseDate.from(now);
		System.out.println(japaneseDate);

	}
}

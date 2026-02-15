package dev.rafael.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
	public static void main(String[] args) {
		LocalTime agora = LocalTime.now();
		LocalTime jaFoi = LocalTime.of(20,30,10);
		System.out.println(agora);
		System.out.println(jaFoi.getHour());
		System.out.println(jaFoi.getMinute());
		System.out.println(jaFoi.getSecond());
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
	}
}

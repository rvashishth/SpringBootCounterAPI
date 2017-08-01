package org.api.counter.test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
		System.out.println(OffsetDateTime.now().format(dtf));
		//System.out.println(LocalDate.now());
	}
}

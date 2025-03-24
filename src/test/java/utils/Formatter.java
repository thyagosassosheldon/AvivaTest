package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;




public class Formatter {

	
	public static String formatter() {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss").format(LocalDateTime.now());
	}

}

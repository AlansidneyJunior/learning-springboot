package br.com.tomus.alan.spring_boot_app.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateUtil {
	public String formatLocalDateTeimeToDatabaseStyle(LocalDateTime localDateTime) {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mn:ss").format(localDateTime);
	}
}

package br.com.tomus.alan.spring_boot_app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Anime {
	private Long id;
	private String name;
	
}

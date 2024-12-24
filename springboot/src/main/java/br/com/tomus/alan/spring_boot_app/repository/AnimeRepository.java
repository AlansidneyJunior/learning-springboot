package br.com.tomus.alan.spring_boot_app.repository;

import java.util.List;

import br.com.tomus.alan.spring_boot_app.domain.Anime;

public interface AnimeRepository {
	List<Anime> listAll();
}

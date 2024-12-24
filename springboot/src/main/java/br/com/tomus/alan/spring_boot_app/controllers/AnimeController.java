package br.com.tomus.alan.spring_boot_app.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tomus.alan.spring_boot_app.domain.Anime;
import br.com.tomus.alan.spring_boot_app.services.AnimeService;
import br.com.tomus.alan.spring_boot_app.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
	
	private final DateUtil dateUtil;
	private final AnimeService animeService;
	
	@GetMapping
	public ResponseEntity<List<Anime>>listAll(){
		log.info(dateUtil.formatLocalDateTeimeToDatabaseStyle(LocalDateTime.now()));
		return ResponseEntity.ok(animeService.listAll());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Anime> findById(@PathVariable Long id){
		log.info(dateUtil.formatLocalDateTeimeToDatabaseStyle(LocalDateTime.now()));
		return ResponseEntity.ok(animeService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Anime> save(@RequestBody Anime anime){
		return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
	}
	
}

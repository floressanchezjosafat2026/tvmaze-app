package com.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ResponseSearchDTO;
import com.app.dto.tvwaze.TvMazeShow;
import com.app.service.ShowService;

@RestController
@RequestMapping("/shows")
public class ShowController {

	
	private final ShowService showService;
	
	
	public ShowController(ShowService showService) {
	    this.showService = showService;
	}
	
	
	
	@GetMapping("/search")
	public List<ResponseSearchDTO> searchShows(
	        @RequestParam("search_query") String searchQuery) {

	    return showService.searchShows(searchQuery);
	}
	
	@GetMapping("/{showId}")
	public TvMazeShow getShowById(@PathVariable Long showId) {

	    return showService.getShowById(showId);
	}
	
	@PostMapping("/comments")
	public ResponseEntity<String> saveComment(
	        @RequestParam("show_id") Long showId,
	        @RequestParam("comment") String comment,
	        @RequestParam("rating") Integer rating) {

		boolean guardado = showService.saveComment(showId, comment, rating);

		if (!guardado) {
		    return ResponseEntity.badRequest().body("El rating debe estar entre 0 y 5");
		}

		return ResponseEntity.status(201).body("Comentario guardado correctamente");
	}
	
}

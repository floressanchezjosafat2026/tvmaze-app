package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ResponseSearchDTO;
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
	
}

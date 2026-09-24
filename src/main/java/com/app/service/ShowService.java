package com.app.service;

import com.app.cliente.TvMazeClient;
import com.app.dto.tvwaze.TvMazeShow;
import com.app.dto.tvwaze.WazeTvSearchResponse;

import com.app.dto.ResponseSearchDTO;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ShowService {

	
	private final TvMazeClient tvMazeClient;

	public ShowService(TvMazeClient tvMazeClient) {
	    this.tvMazeClient = tvMazeClient;
	}
	
	
	  public List<ResponseSearchDTO> searchShows(String query) {
		 List<WazeTvSearchResponse> responses = tvMazeClient.searchShows(query);
		 List<ResponseSearchDTO> results = new ArrayList<>();
		 
		  for (WazeTvSearchResponse response : responses) {
			  TvMazeShow show = response.getShow();
			  
			  String channel = null;

			  if (show.getNetwork() != null) {
			      channel = show.getNetwork().getName();
			  } else if (show.getWebChannel() != null) {
			      channel = show.getWebChannel().getName();
			  }
			  ResponseSearchDTO responseDTO = new ResponseSearchDTO(
		                show.getId(),
		                show.getName(),
		                channel,
		                show.getSummary(),
		                show.getGenres()
		        );
			  results.add(responseDTO);
		    }
		  return results;
	    }
}

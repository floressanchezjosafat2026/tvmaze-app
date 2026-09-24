package com.app.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.app.dto.tvwaze.TvMazeShow;
import com.app.dto.tvwaze.WazeTvSearchResponse;


@Component
public class TvMazeClient {
		
	 private final RestClient restClient;
	  
	 public TvMazeClient(RestClient.Builder builder, @Value("${tvmaze.baseUrl}") String baseUrl) {

		    this.restClient = builder
		            .baseUrl(baseUrl)
		            .build();
		}
	 
	 public List<WazeTvSearchResponse> searchShows(String query) {

		    return restClient.get()
		            .uri(uriBuilder -> uriBuilder
		                    .path("/search/shows")
		                    .queryParam("q", query)
		                    .build())
		            .retrieve()
		            .body(new ParameterizedTypeReference<List<WazeTvSearchResponse>>() {});
		}
	 
	 public TvMazeShow getShowById(Long showId) {

		    return restClient.get()
		            .uri("/shows/{id}", showId)
		            .retrieve()
		            .body(TvMazeShow.class);
		}
}

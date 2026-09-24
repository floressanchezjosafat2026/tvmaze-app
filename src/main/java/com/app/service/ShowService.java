package com.app.service;

import com.app.cliente.TvMazeClient;
import com.app.dto.tvwaze.TvMazeShow;
import com.app.dto.tvwaze.WazeTvSearchResponse;
import com.app.model.DocumentoComment;
import com.app.model.ShowDocument;
import com.app.repository.CommentRepositoory;
import com.app.repository.ShowRepository;
import com.app.dto.ResponseSearchDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class ShowService {

	
	private final TvMazeClient tvMazeClient;
	private final ShowRepository showRepository;
	private final CommentRepositoory commentRepository;

	public ShowService(TvMazeClient tvMazeClient, ShowRepository showRepository, CommentRepositoory commentRepository) {
	    this.tvMazeClient = tvMazeClient;
	    this.showRepository = showRepository;
	    this.commentRepository = commentRepository;
	}
	
	//Buscar Shows por criterio 
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
	  //Consulta de Shows por Id de busqueda
	  public TvMazeShow getShowById(Long showId) {

		    Optional<ShowDocument> cachedShow = showRepository.findById(showId);

		    if (cachedShow.isPresent()) {
		        return cachedShow.get().getShow();
		    }

		    TvMazeShow show = tvMazeClient.getShowById(showId);

		    ShowDocument document = new ShowDocument(
		            show.getId(),
		            show
		    );

		    showRepository.save(document);

		    return show;
		}
	  
	  //Metodo de Generacion de Comentarios
	  public boolean saveComment(Long showId, String comment, Integer rating) {
	        if (rating < 0 || rating > 5) {
	            return false;
	        }
	        DocumentoComment documentoComment =
	                new DocumentoComment(showId, comment, rating);

	        commentRepository.save(documentoComment);
	        return true;
	    }
}

package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.app.dto.tvwaze.TvMazeShow;

@Document(collection = "shows")
public class ShowDocument {

    @Id
    private Long id;

    private TvMazeShow show;

    public ShowDocument() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TvMazeShow getShow() {
		return show;
	}

	public void setShow(TvMazeShow show) {
		this.show = show;
	}

	public ShowDocument(Long id, TvMazeShow show) {
		super();
		this.id = id;
		this.show = show;
	}

	
    
    
    
	
}

package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
public class DocumentoComment {

    @Id
    private String id;

    private Long showId;
    private String comment;
    private Integer rating;

    public DocumentoComment() {
    	
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getShowId() {
		return showId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public DocumentoComment(String id, Long showId, String comment, Integer rating) {
		super();
		this.id = id;
		this.showId = showId;
		this.comment = comment;
		this.rating = rating;
	}
	public DocumentoComment(Long showId, String comment, Integer rating) {

	    this.showId = showId;
	    this.comment = comment;
	    this.rating = rating;
	}
        
}
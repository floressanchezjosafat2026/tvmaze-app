package com.app.dto;

public class CommentResponseDTO {

	
	private String comment;
    private Integer rating;

    public CommentResponseDTO() {
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

	public CommentResponseDTO(String comment, Integer rating) {
		super();
		this.comment = comment;
		this.rating = rating;
	}
    
    
}

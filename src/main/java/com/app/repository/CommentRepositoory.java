package com.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.DocumentoComment;

public interface CommentRepositoory extends MongoRepository<DocumentoComment, String>{
	
	List<DocumentoComment> findByShowId(Long showId);

}

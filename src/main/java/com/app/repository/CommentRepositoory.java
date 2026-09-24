package com.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.DocumentoComment;

public interface CommentRepositoory extends MongoRepository<DocumentoComment, String>{
	
	

}

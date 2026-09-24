package com.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.ShowDocument;

public interface ShowRepository extends MongoRepository<ShowDocument, Long> {

}

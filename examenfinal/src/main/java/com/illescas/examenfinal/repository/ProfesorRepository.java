package com.illescas.examenfinal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends MongoRepository<ProfesorRepository, Long> {
}

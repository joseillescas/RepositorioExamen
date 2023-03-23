package com.illescas.examenfinal.repository;

import com.illescas.examenfinal.model.Periodo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoRepository extends MongoRepository<Periodo, Long> {
}

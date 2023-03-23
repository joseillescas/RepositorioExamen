package com.illescas.examenfinal.repository;

import com.illescas.examenfinal.model.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends MongoRepository<Asignatura, Long> {
}

package com.illescas.examenfinal.service;

import com.illescas.examenfinal.model.Profesor;

import java.util.List;

public interface ProfesorService {

    List<Profesor> getAllProfesor();
    Profesor getProfesorById(Long id_profesor);
    Profesor createProfesor(Profesor profesor);
    Profesor updateProfesor(Long id_profesor, Profesor profesorDetails);
    void deleteProfesor(Long id_profesor);
}

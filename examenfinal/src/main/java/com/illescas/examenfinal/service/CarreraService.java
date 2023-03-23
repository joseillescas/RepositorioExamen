package com.illescas.examenfinal.service;

import com.illescas.examenfinal.model.Asignatura;
import com.illescas.examenfinal.model.Carrera;

import java.util.List;

public interface CarreraService {

    List<Carrera> getAllCarrera();
    Carrera getCarreraById(Long id_carrera);
    Carrera createCarrera(Carrera carrera);
    Carrera updateCarrera(Long id_carrera, Carrera carreraDetails);
    void deleteCarrera(Long id_carrera);
}

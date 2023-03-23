package com.illescas.examenfinal.service;

import com.illescas.examenfinal.model.Asignatura;

import java.util.List;

public interface AsignaturaService {

    List<Asignatura> getAllAsignaturas();
    Asignatura getAsignaturaById(Long id_asignatura);
    Asignatura createAsignatura(Asignatura asignatura);
    Asignatura updateAsignatura(Long id_asignatura, Asignatura asignaturaDetails);
    void deleteAsignatura(Long id_asignatura);

}

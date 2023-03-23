package com.illescas.examenfinal.service;

import com.illescas.examenfinal.model.Ciclo;

import java.util.List;

public interface CicloService {

    List<Ciclo> getAllCiclo();
    Ciclo getCicloById(Long id_ciclo);
    Ciclo createCiclo(Ciclo ciclo);
    Ciclo updateCiclo(Long id_ciclo, Ciclo cicloDetails);
    void deleteCiclo(Long id_ciclo);
}

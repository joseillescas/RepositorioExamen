package com.illescas.examenfinal.service;

import com.illescas.examenfinal.model.Periodo;

import java.util.List;

public interface PeriodoService {

    List<Periodo> getAllPeriodo();
    Periodo getPeriodoById(Long id_periodo);
    Periodo createPeriodo(Periodo periodo);
    Periodo updatePeriodo(Long id_periodo, Periodo periodoDetails);
    void deletePeriodo(Long id_periodo);
}

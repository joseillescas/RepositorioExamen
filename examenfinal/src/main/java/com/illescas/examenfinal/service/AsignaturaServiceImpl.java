package com.illescas.examenfinal.service;

import com.illescas.examenfinal.model.Asignatura;
import com.illescas.examenfinal.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AsignaturaServiceImpl implements AsignaturaService {


    private AsignaturaRepository asignaturaRepository;

    @Override
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaRepository.findAll();
    }

    @Override
    public Asignatura getAsignaturaById(Long id_asignatura){
        Optional<Asignatura> asignatura = asignaturaRepository.findById(id_asignatura);
        if (!asignatura.isPresent()) {}
        return asignatura.get();
    }


    @Override
    public Asignatura createAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public Asignatura updateAsignatura(Long id_asignatura, Asignatura asignaturaDetails){
        Asignatura asignatura = getAsignaturaById(id_asignatura);
        asignatura.setNombre(asignaturaDetails.getNombre());
        asignatura.setN_horas(asignaturaDetails.getN_horas());
        asignatura.setN_horas_practicas(asignaturaDetails.getN_horas_practicas());
        asignatura.setN_horas_autonomas(asignaturaDetails.getN_horas_autonomas());
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public void deleteAsignatura(Long id_asignatura){
        Asignatura asignatura = getAsignaturaById(id_asignatura);
        asignaturaRepository.delete(asignatura);
    }
}

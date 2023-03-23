package com.illescas.examenfinal.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection =  "Asignatura")
public class Asignatura {
    private Long id_asignatura;
    private String nombre;
    private Integer n_horas;
    private Integer n_horas_practicas;
    private Integer n_horas_autonomas;



    private Profesor profesor;
}

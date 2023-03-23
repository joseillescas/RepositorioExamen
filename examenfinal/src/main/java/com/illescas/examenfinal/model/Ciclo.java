package com.illescas.examenfinal.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection =  "Ciclo")
public class Ciclo {

    private Long id_ciclo;
    private String nombre;
    private String descripcion;

    private List<Profesor> profesores;
    private Carrera carrera;

}

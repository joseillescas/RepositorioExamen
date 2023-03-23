package com.illescas.examenfinal.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
@Document(collection =  "Carrera")
public class Carrera {

        private Long id_carrera;
        private String nombre;
        private String descripcion;


        private List<Ciclo> ciclos;

        private List<Periodo> periodos;


}

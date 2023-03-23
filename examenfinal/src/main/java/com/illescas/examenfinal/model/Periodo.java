package com.illescas.examenfinal.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;

@Getter
@Setter
@Document(collection =  "Periodo")
public class Periodo {

    private Long id_periodo;
    private String periodo;
    private Integer year;



    private Carrera carrera;

}
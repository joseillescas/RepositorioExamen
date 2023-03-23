package com.illescas.examenfinal.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection =  "Profesor")
public class Profesor {

    private Long id_profesor;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;


    @DBRef
    private List<Asignatura> asignaturas;
    private List<Ciclo> ciclos;


}

package domain.inscripcion;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Alumno {

    @Getter
    List<Materia> materiasAprobadas ;
    String legajo;
    String nombre;


    public Alumno(String legajo, String nombre) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarMateriasAprobadas(Materia... materia) {
        Collections.addAll(this.materiasAprobadas, materia);
    }


}

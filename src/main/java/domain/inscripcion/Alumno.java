package domain.inscripcion;

import lombok.Getter;

import java.util.List;
public class Alumno {

    @Getter
    List<Materia> materiasAprobadas ;
    Integer legajo;


    public Alumno(Integer legajo, List<Materia> materiasAprobadas) {
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }
}

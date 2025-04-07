package domain.inscripcion;

import java.util.List;

public class Inscripcion {

    List<Materia> materias ;
    Alumno alumno;

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> materia.puedeCursar(this.alumno));
    }
}

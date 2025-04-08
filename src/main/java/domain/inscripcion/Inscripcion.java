package domain.inscripcion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {

    List<Materia> materias ;
    Alumno alumno;

    public Inscripcion( Alumno alumno) {
        this.materias = new ArrayList<>();
        this.alumno = alumno;
    }

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> materia.puedeCursar(this.alumno));
    }

    public void agregarMateriaInscripcion(Materia ... materia){
        Collections.addAll(this.materias, materia);
    }
}

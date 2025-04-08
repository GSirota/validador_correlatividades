package domain.inscripcion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    List<Materia> correlativas;
    String nombre;


    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;

    }

    protected boolean puedeCursar(Alumno alumno){
        List<Materia> materiasAprobadas = alumno.getMateriasAprobadas();

        return this.correlativas.stream().allMatch(materia -> materiasAprobadas.contains(materia));
    }

    public void agregarCorrelativas(Materia ... materia){
        Collections.addAll(this.correlativas, materia);
    }
}

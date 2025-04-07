

import domain.inscripcion.Alumno;
import domain.inscripcion.Inscripcion;
import domain.inscripcion.Materia;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InscripcionMateriasTest {
    Materia algoritmos = new Materia("Algoritmos y Estructura de Datos");
    Materia pdep = new Materia("Paradigmas de Programacion", List.of(algoritmos));
    Materia am = new Materia("Analisis Matematico I");

    @Test
    public void materiasConCorrelativasAprobadas(){

        List<Materia>  materiasIncripcion = List.of(pdep);
        List<Materia>  materiasAprobadas =  List.of(algoritmos);

        Alumno alumno = new Alumno(1234,materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion(materiasIncripcion, alumno);

        assertTrue(inscripcion.aprobada());

    }
    
    @Test
    public void materiasConCorrelativasNoAprobadas(){

        List<Materia>  materiasIncripcion = List.of(pdep);
        List<Materia>  materiasAprobadas = List.of(am);

        Alumno alumno = new Alumno(1234, materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion(materiasIncripcion, alumno);

        assertFalse(inscripcion.aprobada());
    }


}

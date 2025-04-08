package domain.inscripcion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InscripcionMateriasTest {
    Materia algoritmos;
    Materia pdep;
    Materia am;
    Materia am2;
    Alumno pepe;

    @BeforeEach
    public void init(){
        algoritmos = new Materia("Algoritmos y Estructura de Datos");
        pdep = new Materia("Paradigmas de Programacion");
        am = new Materia("Analisis Matematico I");
        am2 = new Materia("Analisis Matematico II");
        pepe = new Alumno(1234, "Pepe Grillo");

        pdep.agregarCorrelativas(algoritmos);
        am2.agregarCorrelativas(am);
    }

    @Test
    @DisplayName("La inscripción está aceptada por cumplir con correlativas")
    public void materiasConCorrelativasAprobadas(){
        pepe.agregarMateriasAprobadas(algoritmos,am);
        Inscripcion inscripcion = new Inscripcion(pepe);
        inscripcion.agregarMateriaInscripcion(pdep,am2);

        assertTrue(inscripcion.aprobada());

    }
    
    @Test
    @DisplayName("La inscripción está rechazada por no cumplir con correlativas")
    public void materiasConCorrelativasNoAprobadas(){
        Inscripcion inscripcion = new Inscripcion(pepe);
        inscripcion.agregarMateriaInscripcion(pdep,am2);

        assertFalse(inscripcion.aprobada());
    }


}

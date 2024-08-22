package com.ezlearning.platform.repositories;

import com.ezlearning.platform.model.Curso;
import com.ezlearning.platform.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNomCurso(String nombre);
    List<Curso> findAllByProfesor(Profesor profesor);
}
